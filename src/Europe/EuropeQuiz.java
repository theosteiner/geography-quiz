package Europe;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import Main.MainGUI;
import Main.Quiz;

public class EuropeQuiz extends Quiz
{
	public EuropeQuiz()
	{
		super();
		final File f = new File("bin/eu/europemap.png");
		quizDialog.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				quizDialog.dispose();
				EuropeGUI.frame.dispose();
				gui.setImage(f);
				MainGUI.getMainFrame().setVisible(true);
				MainGUI.getDialog().setVisible(true);
			}
		});
		quizDialog.setLocation(1156, 250);
		quizDialog.setVisible(true);
		name = "Europe";
		continent = new Europe();
		gui = new EuropeGUI();
	}
	public void makeQuiz()
	{
		super.initQuiz();
		if (!isEmpty())
		{
			switch (pickRandomCountry().getName())
			{
				case "Albania":
					file = new File("bin/eu/albania.png");
					gui.setImage(file);
					break;
				case "Andorra":
					file = new File("bin/eu/andorra.png");
					gui.setImage(file);
					break;
				case "Austria":
					file = new File("bin/eu/austria.png");
					gui.setImage(file);
					break;
				case "Belarus":
					file = new File("bin/eu/belarus.png");
					gui.setImage(file);
					break;
				case "Belgium":
					file = new File("bin/eu/belgium.png");
					gui.setImage(file);
					break;
				case "Bosnia and Herzegovina":
					file = new File("bin/eu/bosnia.png");
					gui.setImage(file);
					break;
				case "Bulgaria":
					file = new File("bin/eu/bulgaria.png");
					gui.setImage(file);
					break;
				case "Croatia":
					file = new File("bin/eu/croatia.png");
					gui.setImage(file);
					break;
				case "Cyprus":
					file = new File("bin/eu/cyprus.png");
					gui.setImage(file);
					break;
				case "Czechia":
					file = new File("bin/eu/czechia.png");
					gui.setImage(file);
					break;
				case "Denmark":
					file = new File("bin/eu/denmark.png");
					gui.setImage(file);
					break;
				case "Estonia":
					file = new File("bin/eu/estonia.png");
					gui.setImage(file);
					break;
				case "Finland":
					file = new File("bin/eu/finland.png");
					gui.setImage(file);
					break;
				case "France":
					file = new File("bin/eu/france.png");
					gui.setImage(file);
					break;
				case "Germany":
					file = new File("bin/eu/germany.png");
					gui.setImage(file);
					break;
				case "Greece":
					file = new File("bin/eu/greece.png");
					gui.setImage(file);
					break;
				case "Hungary":
					file = new File("bin/eu/hungary.png");
					gui.setImage(file);
					break;
				case "Iceland":
					file = new File("bin/eu/iceland.png");
					gui.setImage(file);
					break;
				case "Ireland":
					file = new File("bin/eu/ireland.png");
					gui.setImage(file);
					break;
				case "Italy":
					file = new File("bin/eu/italy.png");
					gui.setImage(file);
					break;
				case "Kosovo":
					file = new File("bin/eu/kosovo.png");
					gui.setImage(file);
					break;
				case "Latvia":
					file = new File("bin/eu/latvia.png");
					gui.setImage(file);
					break;
				case "Liechtenstein":
					file = new File("bin/eu/liechtenstein.png");
					gui.setImage(file);
					break;
				case "Lithuania":
					file = new File("bin/eu/lithuania.png");
					gui.setImage(file);
					break;
				case "Luxembourg":
					file = new File("bin/eu/luxembourg.png");
					gui.setImage(file);
					break;
				case "Macedonia":
					file = new File("bin/eu/macedonia.png");
					gui.setImage(file);
					break;
				case "Malta":
					file = new File("bin/eu/malta.png");
					gui.setImage(file);
					break;
				case "Moldova":
					file = new File("bin/eu/moldova.png");
					gui.setImage(file);
					break;
				case "Monaco":
					file = new File("bin/eu/monaco.png");
					gui.setImage(file);
					break;
				case "Montenegro":
					file = new File("bin/eu/montenegro.png");
					gui.setImage(file);
					break;
				case "Netherlands":
					file = new File("bin/eu/netherlands.png");
					gui.setImage(file);
					break;
				case "Norway":
					file = new File("bin/eu/norway.png");
					gui.setImage(file);
					break;
				case "Poland":
					file = new File("bin/eu/poland.png");
					gui.setImage(file);
					break;
				case "Portugal":
					file = new File("bin/eu/portugal.png");
					gui.setImage(file);
					break;
				case "Romania":
					file = new File("bin/eu/romania.png");
					gui.setImage(file);
					break;
				case "Russia":
					file = new File("bin/eu/russia.png");
					gui.setImage(file);
					break;
				case "San Marino":
					file = new File("bin/eu/sanmarino.png");
					gui.setImage(file);
					break;
				case "Serbia":
					file = new File("bin/eu/serbia.png");
					gui.setImage(file);
					break;
				case "Slovakia":
					file = new File("bin/eu/slovakia.png");
					gui.setImage(file);
					break;
				case "Slovenia":
					file = new File("bin/eu/slovenia.png");
					gui.setImage(file);
					break;
				case "Spain":
					file = new File("bin/eu/spain.png");
					gui.setImage(file);
					break;
				case "Sweden":
					file = new File("bin/eu/sweden.png");
					gui.setImage(file);
					break;
				case "Switzerland":
					file = new File("bin/eu/switzerland.png");
					gui.setImage(file);
					break;
				case "Turkey":
					file = new File("bin/eu/turkey.png");
					gui.setImage(file);
					break;
				case "Ukraine":
					file = new File("bin/eu/ukraine.png");
					gui.setImage(file);
					break;
				case "United Kingdom":
					file = new File("bin/eu/uk.png");
					gui.setImage(file);
					break;
				case "Vatican City":
					file = new File("bin/eu/vaticancity.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}