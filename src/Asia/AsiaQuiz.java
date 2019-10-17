package Asia;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import Main.MainGUI;
import Main.Quiz;

public class AsiaQuiz extends Quiz
{
	public AsiaQuiz()
	{
		super();
		final File f = new File("images/as/asiamap.png");
		quizDialog.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				quizDialog.dispose();
				AsiaGUI.frame.dispose();
				gui.setImage(f);
				MainGUI.getMainFrame().setVisible(true);
				MainGUI.getDialog().setVisible(true);
			}
		});
		quizDialog.setLocation(1193, 220);
		quizDialog.setVisible(true);
		name = "Asia";
		continent = new Asia();
		gui = new AsiaGUI();
	}
	public void makeQuiz()
	{
		super.initQuiz();
		if (!isEmpty())
		{
			switch (pickRandomCountry().getName())
			{
				case "Afghanistan":
					file = new File("images/as/afghanistan.png");
					gui.setImage(file);
					break;
				case "Armenia":
					file = new File("images/as/armenia.png");
					gui.setImage(file);
					break;
				case "Azerbaijan":
					file = new File("images/as/azerbaijan.png");
					gui.setImage(file);
					break;
				case "Bahrain":
					file = new File("images/as/bahrain.png");
					gui.setImage(file);
					break;
				case "Bangladesh":
					file = new File("images/as/bangladesh.png");
					gui.setImage(file);
					break;
				case "Bhutan":
					file = new File("images/as/bhutan.png");
					gui.setImage(file);
					break;
				case "Brunei":
					file = new File("images/as/brunei.png");
					gui.setImage(file);
					break;
				case "Cambodia":
					file = new File("images/as/cambodia.png");
					gui.setImage(file);
					break;
				case "China":
					file = new File("images/as/china.png");
					gui.setImage(file);
					break;
				case "Cyprus":
					file = new File("images/as/cyprus.png");
					gui.setImage(file);
					break;
				case "East Timor":
					file = new File("images/as/easttimor.png");
					gui.setImage(file);
					break;
				case "Georgia":
					file = new File("images/as/georgia.png");
					gui.setImage(file);
					break;
				case "India":
					file = new File("images/as/india.png");
					gui.setImage(file);
					break;
				case "Indonesia":
					file = new File("images/as/indonesia.png");
					gui.setImage(file);
					break;
				case "Iran":
					file = new File("images/as/iran.png");
					gui.setImage(file);
					break;
				case "Iraq":
					file = new File("images/as/iraq.png");
					gui.setImage(file);
					break;
				case "Israel":
					file = new File("images/as/israel.png");
					gui.setImage(file);
					break;
				case "Japan":
					file = new File("images/as/japan.png");
					gui.setImage(file);
					break;
				case "Jordan":
					file = new File("images/as/jordan.png");
					gui.setImage(file);
					break;
				case "Kazakhstan":
					file = new File("images/as/kazakhstan.png");
					gui.setImage(file);
					break;
				case "Kuwait":
					file = new File("images/as/kuwait.png");
					gui.setImage(file);
					break;
				case "Kyrgyzstan":
					file = new File("images/as/kyrgyzstan.png");
					gui.setImage(file);
					break;
				case "Laos":
					file = new File("images/as/laos.png");
					gui.setImage(file);
					break;
				case "Lebanon":
					file = new File("images/as/lebanon.png");
					gui.setImage(file);
					break;
				case "Malaysia":
					file = new File("images/as/malaysia.png");
					gui.setImage(file);
					break;
				case "Maldives":
					file = new File("images/as/maldives.png");
					gui.setImage(file);
					break;
				case "Mongolia":
					file = new File("images/as/mongolia.png");
					gui.setImage(file);
					break;
				case "Myanmar":
					file = new File("images/as/myanmar.png");
					gui.setImage(file);
					break;
				case "Nepal":
					file = new File("images/as/nepal.png");
					gui.setImage(file);
					break;
				case "North Korea":
					file = new File("images/as/northkorea.png");
					gui.setImage(file);
					break;
				case "Oman":
					file = new File("images/as/oman.png");
					gui.setImage(file);
					break;
				case "Pakistan":
					file = new File("images/as/pakistan.png");
					gui.setImage(file);
					break;
				case "Philippines":
					file = new File("images/as/philippines.png");
					gui.setImage(file);
					break;
				case "Qatar":
					file = new File("images/as/qatar.png");
					gui.setImage(file);
					break;
				case "Russia":
					file = new File("images/as/russia.png");
					gui.setImage(file);
					break;
				case "Saudi Arabia":
					file = new File("images/as/saudiarabia.png");
					gui.setImage(file);
					break;
				case "Singapore":
					file = new File("images/as/singapore.png");
					gui.setImage(file);
					break;
				case "South Korea":
					file = new File("images/as/southkorea.png");
					gui.setImage(file);
					break;
				case "Sri Lanka":
					file = new File("images/as/srilanka.png");
					gui.setImage(file);
					break;
				case "Syria":
					file = new File("images/as/syria.png");
					gui.setImage(file);
					break;
				case "Taiwan":
					file = new File("images/as/taiwan.png");
					gui.setImage(file);
					break;
				case "Tajikistan":
					file = new File("images/as/tajikistan.png");
					gui.setImage(file);
					break;
				case "Thailand":
					file = new File("images/as/thailand.png");
					gui.setImage(file);
					break;
				case "Turkey":
					file = new File("images/as/turkey.png");
					gui.setImage(file);
					break;
				case "Turkmenistan":
					file = new File("images/as/turkmenistan.png");
					gui.setImage(file);
					break;
				case "United Arab Emirates":
					file = new File("images/as/uae.png");
					gui.setImage(file);
					break;
				case "Uzbekistan":
					file = new File("images/as/uzbekistan.png");
					gui.setImage(file);
					break;
				case "Vietnam":
					file = new File("images/as/vietnam.png");
					gui.setImage(file);
					break;
				case "Yemen":
					file = new File("images/as/yemen.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}
