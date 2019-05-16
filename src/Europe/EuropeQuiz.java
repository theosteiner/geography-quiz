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
		final File f = new File("images/eu/europemap.png");
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
					file = new File("images/eu/albania.png");
					gui.setImage(file);
					break;
				case "Andorra":
					file = new File("images/eu/andorra.png");
					gui.setImage(file);
					break;
				case "Austria":
					file = new File("images/eu/austria.png");
					gui.setImage(file);
					break;
				case "Belarus":
					file = new File("images/eu/belarus.png");
					gui.setImage(file);
					break;
				case "Belgium":
					file = new File("images/eu/belgium.png");
					gui.setImage(file);
					break;
				case "Bosnia and Herzegovina":
					file = new File("images/eu/bosnia.png");
					gui.setImage(file);
					break;
				case "Bulgaria":
					file = new File("images/eu/bulgaria.png");
					gui.setImage(file);
					break;
				case "Croatia":
					file = new File("images/eu/croatia.png");
					gui.setImage(file);
					break;
				case "Cyprus":
					file = new File("images/eu/cyprus.png");
					gui.setImage(file);
					break;
				case "Czechia":
					file = new File("images/eu/czechia.png");
					gui.setImage(file);
					break;
				case "Denmark":
					file = new File("images/eu/denmark.png");
					gui.setImage(file);
					break;
				case "Estonia":
					file = new File("images/eu/estonia.png");
					gui.setImage(file);
					break;
				case "Finland":
					file = new File("images/eu/finland.png");
					gui.setImage(file);
					break;
				case "France":
					file = new File("images/eu/france.png");
					gui.setImage(file);
					break;
				case "Germany":
					file = new File("images/eu/germany.png");
					gui.setImage(file);
					break;
				case "Greece":
					file = new File("images/eu/greece.png");
					gui.setImage(file);
					break;
				case "Hungary":
					file = new File("images/eu/hungary.png");
					gui.setImage(file);
					break;
				case "Iceland":
					file = new File("images/eu/iceland.png");
					gui.setImage(file);
					break;
				case "Ireland":
					file = new File("images/eu/ireland.png");
					gui.setImage(file);
					break;
				case "Italy":
					file = new File("images/eu/italy.png");
					gui.setImage(file);
					break;
				case "Kosovo":
					file = new File("images/eu/kosovo.png");
					gui.setImage(file);
					break;
				case "Latvia":
					file = new File("images/eu/latvia.png");
					gui.setImage(file);
					break;
				case "Liechtenstein":
					file = new File("images/eu/liechtenstein.png");
					gui.setImage(file);
					break;
				case "Lithuania":
					file = new File("images/eu/lithuania.png");
					gui.setImage(file);
					break;
				case "Luxembourg":
					file = new File("images/eu/luxembourg.png");
					gui.setImage(file);
					break;
				case "Macedonia":
					file = new File("images/eu/macedonia.png");
					gui.setImage(file);
					break;
				case "Malta":
					file = new File("images/eu/malta.png");
					gui.setImage(file);
					break;
				case "Moldova":
					file = new File("images/eu/moldova.png");
					gui.setImage(file);
					break;
				case "Monaco":
					file = new File("images/eu/monaco.png");
					gui.setImage(file);
					break;
				case "Montenegro":
					file = new File("images/eu/montenegro.png");
					gui.setImage(file);
					break;
				case "Netherlands":
					file = new File("images/eu/netherlands.png");
					gui.setImage(file);
					break;
				case "Norway":
					file = new File("images/eu/norway.png");
					gui.setImage(file);
					break;
				case "Poland":
					file = new File("images/eu/poland.png");
					gui.setImage(file);
					break;
				case "Portugal":
					file = new File("images/eu/portugal.png");
					gui.setImage(file);
					break;
				case "Romania":
					file = new File("images/eu/romania.png");
					gui.setImage(file);
					break;
				case "Russia":
					file = new File("images/eu/russia.png");
					gui.setImage(file);
					break;
				case "San Marino":
					file = new File("images/eu/sanmarino.png");
					gui.setImage(file);
					break;
				case "Serbia":
					file = new File("images/eu/serbia.png");
					gui.setImage(file);
					break;
				case "Slovakia":
					file = new File("images/eu/slovakia.png");
					gui.setImage(file);
					break;
				case "Slovenia":
					file = new File("images/eu/slovenia.png");
					gui.setImage(file);
					break;
				case "Spain":
					file = new File("images/eu/spain.png");
					gui.setImage(file);
					break;
				case "Sweden":
					file = new File("images/eu/sweden.png");
					gui.setImage(file);
					break;
				case "Switzerland":
					file = new File("images/eu/switzerland.png");
					gui.setImage(file);
					break;
				case "Turkey":
					file = new File("images/eu/turkey.png");
					gui.setImage(file);
					break;
				case "Ukraine":
					file = new File("images/eu/ukraine.png");
					gui.setImage(file);
					break;
				case "United Kingdom":
					file = new File("images/eu/uk.png");
					gui.setImage(file);
					break;
				case "Vatican City":
					file = new File("images/eu/vaticancity.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}
