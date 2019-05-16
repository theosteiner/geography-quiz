package Oceania;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import Main.MainGUI;
import Main.Quiz;

public class OceaniaQuiz extends Quiz
{
	public OceaniaQuiz()
	{
		super();
		final File f = new File("images/oc/oceaniamap.png");
		quizDialog.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				quizDialog.dispose();
				OceaniaGUI.frame.dispose();
				gui.setImage(f);
				MainGUI.getMainFrame().setVisible(true);
				MainGUI.getDialog().setVisible(true);
			}
		});
		quizDialog.setLocation(1068, 240);
		quizDialog.setVisible(true);
		name = "Oceania";
		continent = new Oceania();
		gui = new OceaniaGUI();
	}
	public void makeQuiz()
	{
		super.initQuiz();
		if (!isEmpty())
		{
			switch (pickRandomCountry().getName())
			{
				case "Australia":
					file = new File("images/oc/australia.png");
					gui.setImage(file);
					break;
				case "Fiji":
					file = new File("images/oc/fiji.png");
					gui.setImage(file);
					break;
				case "Kiribati":
					file = new File("images/oc/kiribati.png");
					gui.setImage(file);
					break;
				case "Marshall Islands":
					file = new File("images/oc/marshallislands.png");
					gui.setImage(file);
					break;
				case "Micronesia":
					file = new File("images/oc/micronesia.png");
					gui.setImage(file);
					break;
				case "Nauru":
					file = new File("images/oc/nauru.png");
					gui.setImage(file);
					break;
				case "New Zealand":
					file = new File("images/oc/newzealand.png");
					gui.setImage(file);
					break;
				case "Palau":
					file = new File("images/oc/palau.png");
					gui.setImage(file);
					break;
				case "Papua New Guinea":
					file = new File("images/oc/papuanewguinea.png");
					gui.setImage(file);
					break;
				case "Samoa":
					file = new File("images/oc/samoa.png");
					gui.setImage(file);
					break;
				case "Solomon Islands":
					file = new File("images/oc/solomonislands.png");
					gui.setImage(file);
					break;
				case "Tonga":
					file = new File("images/oc/tonga.png");
					gui.setImage(file);
					break;
				case "Tuvalu":
					file = new File("images/oc/tuvalu.png");
					gui.setImage(file);
					break;
				case "Vanuatu":
					file = new File("images/oc/vanuatu.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}
