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
		final File f = new File("bin/oc/oceaniamap.png");
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
					file = new File("bin/oc/australia.png");
					gui.setImage(file);
					break;
				case "Fiji":
					file = new File("bin/oc/fiji.png");
					gui.setImage(file);
					break;
				case "Kiribati":
					file = new File("bin/oc/kiribati.png");
					gui.setImage(file);
					break;
				case "Marshall Islands":
					file = new File("bin/oc/marshallislands.png");
					gui.setImage(file);
					break;
				case "Micronesia":
					file = new File("bin/oc/micronesia.png");
					gui.setImage(file);
					break;
				case "Nauru":
					file = new File("bin/oc/nauru.png");
					gui.setImage(file);
					break;
				case "New Zealand":
					file = new File("bin/oc/newzealand.png");
					gui.setImage(file);
					break;
				case "Palau":
					file = new File("bin/oc/palau.png");
					gui.setImage(file);
					break;
				case "Papua New Guinea":
					file = new File("bin/oc/papuanewguinea.png");
					gui.setImage(file);
					break;
				case "Samoa":
					file = new File("bin/oc/samoa.png");
					gui.setImage(file);
					break;
				case "Solomon Islands":
					file = new File("bin/oc/solomonislands.png");
					gui.setImage(file);
					break;
				case "Tonga":
					file = new File("bin/oc/tonga.png");
					gui.setImage(file);
					break;
				case "Tuvalu":
					file = new File("bin/oc/tuvalu.png");
					gui.setImage(file);
					break;
				case "Vanuatu":
					file = new File("bin/oc/vanuatu.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}