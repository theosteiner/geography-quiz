package Main;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.Math;
import java.text.DecimalFormat;
import javax.swing.*;

public abstract class Quiz implements ActionListener
{
	protected GUI gui;
	protected Continent continent;
	protected JDialog quizDialog;
	protected File file;
	protected String name, ans;
	private int qCount, correct, rc, instance;
	private JTextField box1, box2;
	private Container pane;
	private JPanel top, middle, bottom, nextPanel, wrongPanel;
	private JLabel counter, wrong;
	private JButton next;
	private Color origColor;

	public Quiz()
	{
		qCount = 0;
		correct = 0;
		instance = 0;
		quizDialog = new JDialog();
		quizDialog.setSize(MainGUI.DIALOG_WIDTH, MainGUI.DIALOG_HEIGHT);
		quizDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	}
	public JDialog getQuizDialog()
	{
		return quizDialog;
	}
	public void initQuiz()
	{
		if (instance == 0)
		{
			quizDialog.setTitle(name + " Quiz");
			
			pane = quizDialog.getContentPane();
			pane.setLayout(null);

			top = new JPanel();
			top.setBounds(0, 0, MainGUI.DIALOG_WIDTH, 150);

			JLabel[] txt1 = new JLabel[2];
			txt1[0] = new JLabel("What country", SwingConstants.CENTER);
			txt1[1] = new JLabel("is this?", SwingConstants.CENTER);

			for (JLabel lbl : txt1)
			{
				lbl.setFont(new Font("Courier", Font.BOLD, 35));
				lbl.setForeground(Color.BLACK);
				lbl.setVerticalAlignment(JLabel.CENTER);
				lbl.setHorizontalAlignment(JLabel.CENTER);
				top.add(lbl);
			}

			box1 = new JTextField();
			origColor = box1.getBackground();
			box1.setBounds(130, 50, 250, 50);
			box1.setPreferredSize(new Dimension(250, 30));
			box1.setHorizontalAlignment(JTextField.CENTER);

			top.add(box1);

			bottom = new JPanel();
			bottom.setBounds(0, 425, 175, 30);
			counter = new JLabel("Correct Answers: " + correct);
			counter.setFont(new Font("Courier", Font.PLAIN, 15));
			bottom.add(counter);

			pane.add(bottom);
			pane.repaint();
			pane.add(top);

			nextPanel = new JPanel();
			nextPanel.setBounds(0, 375, MainGUI.DIALOG_WIDTH, 50);
			next = new JButton("Next Question");
			next.setFont(new Font("Courier", Font.PLAIN, 20));

			nextPanel.add(next);
			pane.add(nextPanel);
			pane.revalidate();

			box1.addActionListener(this);
			next.addActionListener(this);
		}
	}
	public boolean isEmpty()
	{
		return continent.getCountryList().size() == 0;
	}
	public Country pickRandomCountry()
	{
		rc = (int)(Math.random() * continent.getCountryList().size());
		return continent.getCountryList().get(rc);
	}
	private void checkCountry(String ans)
	{
		String correctAns = continent.getCountryList().get(rc).getName();
		qCount++;
		if (ans.equalsIgnoreCase(correctAns))
		{
			box1.setBackground(Color.GREEN);
			counter.setText("Correct Answers: " + ++correct);
			counter.repaint();
			showCapitalQuery();
			if (box2 != null)
			{
				box2.grabFocus();
			}
		}
		else
		{
			continent.getCountryList().remove(rc);
			box1.setBackground(Color.RED);
			showCorrectAns(correctAns);
		}
	}
	private void checkCapital(String ans)
	{
		String correctAns = continent.getCountryList().remove(rc).getCapital();
		qCount++;
		if (ans.equalsIgnoreCase(correctAns))
		{
			box2.setBackground(Color.GREEN);
			counter.setText("Correct Answers: " + ++correct);
			counter.repaint();
		}
		else
		{
			box2.setBackground(Color.RED);
			showCorrectAns(correctAns);
		}
	}
	private void showCapitalQuery()
	{
		middle = new JPanel();
		middle.setBounds(0, 155, MainGUI.DIALOG_WIDTH, 150);

		JLabel[] txt2 = new JLabel[2];
		txt2[0] = new JLabel("What is its");
		txt2[1] = new JLabel("capital?");

		for (JLabel lbl : txt2)
		{
			lbl.setFont(new Font("Courier", Font.BOLD, 35));
			lbl.setForeground(Color.BLACK);
		}
		txt2[1].setVerticalAlignment(JLabel.BOTTOM);
		txt2[1].setHorizontalAlignment(JLabel.CENTER);

		for (JLabel lbl : txt2)
		{
			middle.add(lbl);
		}

		box2 = new JTextField();
		box2.setBounds(130, 500, 250, 50);
		box2.setPreferredSize(new Dimension(250, 30));
		box2.setHorizontalAlignment(JTextField.CENTER);
		box2.addActionListener(this);

		middle.add(box2);
		pane.add(middle);
	}
	private void showCorrectAns(String correctAns)
	{
		wrongPanel = new JPanel();
		wrongPanel.setBounds(0, 350, MainGUI.DIALOG_WIDTH, 100);
		wrong = new JLabel(correctAns);
		wrong.setFont(new Font("Courier", Font.PLAIN, 15));
		wrong.setForeground(Color.BLACK);
		wrongPanel.add(wrong);

		pane.revalidate();
		pane.add(wrongPanel);
	}
	private void refresh()
	{
		instance++;
		box1.repaint();
		box1.setText("");
		box1.setBackground(origColor);
		if (box2 != null && box2.isShowing())
		{
			box2.repaint();
			box2.setText("");
			box2.setBackground(origColor);
		}
		if (wrong != null)
		{
			wrong.setText("");
		}
		if (middle != null)
		{
			middle.repaint();
			pane.remove(middle);
		}
		pane.repaint();
		pane.revalidate();
		box1.grabFocus();
	}
	public void finishQuiz()
	{
		if (isEmpty() && qCount >= continent.getCountryList().size())
		{
			pane.removeAll();
			JPanel pnl = new JPanel();
			pnl.setBounds(0, 125, MainGUI.DIALOG_WIDTH, MainGUI.DIALOG_HEIGHT);

			JTextArea msg = new JTextArea("Congratulations! You got " + correct + " out of " + qCount + " correct.");
			msg.setFont(new Font("Courier", Font.PLAIN, 30));
			msg.setLineWrap(true);
			msg.setWrapStyleWord(true);
			msg.setOpaque(false);
			msg.setEditable(false);
			msg.setBounds(0, 0, 300, MainGUI.DIALOG_HEIGHT);

			DecimalFormat fmt = new DecimalFormat("##");
			JLabel per = new JLabel("That is " + fmt.format((double)correct / qCount * 100) + "%.");
			per.setFont(new Font("Courier", Font.PLAIN, 30));

			pnl.add(msg);
			pnl.add(per);
			pane.add(pnl);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == box1)
		{
			ans = box1.getText();
			checkCountry(ans);
		}
		else if (e.getSource() == box2)
		{
			ans = box2.getText();
			checkCapital(ans);
		}
		else
		{
			refresh();
			makeQuiz();
		}
	}
	public abstract void makeQuiz();
}
