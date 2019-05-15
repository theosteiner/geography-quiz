package Main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import Africa.*;
import Americas.*;
import Asia.*;
import Europe.*;
import Oceania.*;

public class MainGUI
{
	private static final int FRAME_WIDTH = 1375;
	private static final int FRAME_HEIGHT = 675;
	public static final int DIALOG_WIDTH = 400;
	public static final int DIALOG_HEIGHT = 500;
	private static JFrame frame, africa, americas, asia, europe, oceania;
	private JLabel label;
	private BufferedImage image;
	private static JDialog dialog;
	private JPanel panel;
	private JButton[] buttons;
	private GUI[] guis;

	public MainGUI()
	{
		guis = new GUI[] {new AfricaGUI(), new AmericasGUI(), new AsiaGUI(),
				new EuropeGUI(), new OceaniaGUI()};
		setUpMaps();
		setUpFrame();
		setUpDialog();
	}
	public static JFrame getMainFrame()
	{
		return frame;
	}
	public static JFrame getAfricaFrame()
	{
		return africa;
	}
	public static JFrame getAmericasFrame()
	{
		return americas;
	}
	public static JFrame getAsiaFrame()
	{
		return asia;
	}
	public static JFrame getEuropeFrame()
	{
		return europe;
	}
	public static JFrame getOceaniaFrame()
	{
		return oceania;
	}
	public static JDialog getDialog()
	{
		return dialog;
	}
	private void setUpMaps()
	{
		try
		{
			image = ImageIO.read(new File("images/worldmap.png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		label = new JLabel(new ImageIcon(image), JLabel.CENTER);
		
		for (GUI gui : guis)
		{
			gui.createMap();
		}
	}
	private void setUpFrame()
	{	
		frame = new JFrame("World Map");
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(label);
		frame.setVisible(true);
	}
	private void setUpDialog()
	{
		dialog = new JDialog();
		dialog.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});

		dialog.setLocationRelativeTo(null);
		dialog.setTitle("Quiz Selection");
		dialog.setVisible(true);
		dialog.setAlwaysOnTop(true);

		buttons = new JButton[5];
		buttons[0] = new JButton("Africa Quiz");
		buttons[1] = new JButton("Americas Quiz");
		buttons[2] = new JButton("Asia Quiz");
		buttons[3] = new JButton("Europe Quiz");
		buttons[4] = new JButton("Oceania Quiz");

		Container pane = dialog.getContentPane();
		pane.setLayout(null);
		
		int y = 85;
		for (JButton btn : buttons)
		{
			btn.setBounds(65, y, 250, 50);
			y += 65;
			btn.setFont(new Font("Courier", Font.PLAIN, 20));
			pane.add(btn);
		}

		panel = new JPanel();
		JLabel text = new JLabel("Select a Quiz:");
		text.setFont(new Font("Courier", Font.BOLD, 20));
		text.setForeground(Color.RED);
		panel.add(text);
		panel.setBounds(65, 25, 250, 50);
		pane.add(panel);

		setUpButtonListeners();
	}
	private void setUpButtonListeners()
	{
		for (final JButton btn : buttons)
		{
			btn.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (btn.getText().equals("Africa Quiz"))
					{
						guis[0].createFrame();
						guis[0].createQuiz();
					}
					else if (btn.getText().equals("Americas Quiz"))
					{
						guis[1].createFrame();
						guis[1].createQuiz();
					}
					else if (btn.getText().equals("Asia Quiz"))
					{
						guis[2].createFrame();
						guis[2].createQuiz();
					}
					else if (btn.getText().equals("Europe Quiz"))
					{
						guis[3].createFrame();
						guis[3].createQuiz();
					}
					else
					{
						guis[4].createFrame();
						guis[4].createQuiz();
					}
				}
			});
		}
	}
}