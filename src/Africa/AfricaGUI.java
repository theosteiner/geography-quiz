package Africa;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import Main.*;

public class AfricaGUI implements GUI
{
	public static JFrame frame;
	public static JLabel label;
	private BufferedImage image;
	private Quiz quiz;

	public void setImage(File file)
	{
		try
		{
			label.setIcon(new ImageIcon(ImageIO.read(file)));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		frame.add(label);
	}
	public void createMap()
	{
		try
		{
			image = ImageIO.read(new File("images/af/africamap.png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		label = new JLabel(new ImageIcon(image), JLabel.CENTER);
	}
	public void createFrame()
	{
		frame = new JFrame("Africa Map");
		frame.setSize(979, 815);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				frame.dispose();
				if (quiz != null)
				{
					quiz.getQuizDialog().dispose();
				}
				MainGUI.getMainFrame().setVisible(true);
				MainGUI.getDialog().setVisible(true);
			}
		});

		frame.setLocation(200, 100);
		frame.add(label);
		MainGUI.getDialog().dispose();
		MainGUI.getMainFrame().dispose();
		frame.setVisible(true);
	}
	public void createQuiz()
	{
		final JDialog jd = new JDialog();
		jd.setSize(MainGUI.DIALOG_WIDTH, MainGUI.DIALOG_HEIGHT);
		jd.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		jd.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		frame.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				jd.dispose();
			}
		});
		jd.setTitle("Africa Quiz");
		jd.setLocation(1163, 200);
		jd.setVisible(true);

		Container pane = jd.getContentPane();
		pane.setLayout(null);

		JPanel pnl = new JPanel();
		pnl.setLayout(new FlowLayout());

		JLabel[] txt = new JLabel[2];
		txt[0] = new JLabel("Welcome to the");
		txt[1] = new JLabel("Africa Quiz!");

		for (JLabel lbl : txt)
		{
			lbl.setFont(new Font("Courier", Font.BOLD, 35));
			lbl.setForeground(Color.BLACK);
		}

		txt[1].setVerticalAlignment(JLabel.CENTER);
		txt[1].setHorizontalAlignment(JLabel.CENTER);

		pnl.setBounds(40, 100, 300, 250);

		for (JLabel lbl : txt)
		{
			pnl.add(lbl);
		}

		pane.add(pnl);

		JButton btn = new JButton("Click to Start");
		btn.setBounds(65, 245, 250, 50);
		btn.setFont(new Font("Courier", Font.PLAIN, 20));
		btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				quiz = new AfricaQuiz();
				jd.dispose();
				quiz.makeQuiz();
			}
		});

		pane.add(btn);
	}
}
