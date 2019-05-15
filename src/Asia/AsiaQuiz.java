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
		final File f = new File("bin/as/asiamap.png");
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
					file = new File("bin/as/afghanistan.png");
					gui.setImage(file);
					break;
				case "Armenia":
					file = new File("bin/as/armenia.png");
					gui.setImage(file);
					break;
				case "Azerbaijan":
					file = new File("bin/as/azerbaijan.png");
					gui.setImage(file);
					break;
				case "Bahrain":
					file = new File("bin/as/bahrain.png");
					gui.setImage(file);
					break;
				case "Bangladesh":
					file = new File("bin/as/bangladesh.png");
					gui.setImage(file);
					break;
				case "Bhutan":
					file = new File("bin/as/bhutan.png");
					gui.setImage(file);
					break;
				case "Brunei":
					file = new File("bin/as/brunei.png");
					gui.setImage(file);
					break;
				case "Cambodia":
					file = new File("bin/as/cambodia.png");
					gui.setImage(file);
					break;
				case "China":
					file = new File("bin/as/china.png");
					gui.setImage(file);
					break;
				case "Cyprus":
					file = new File("bin/as/cyprus.png");
					gui.setImage(file);
					break;
				case "East Timor":
					file = new File("bin/as/easttimor.png");
					gui.setImage(file);
					break;
				case "Georgia":
					file = new File("bin/as/georgia.png");
					gui.setImage(file);
					break;
				case "India":
					file = new File("bin/as/india.png");
					gui.setImage(file);
					break;
				case "Indonesia":
					file = new File("bin/as/indonesia.png");
					gui.setImage(file);
					break;
				case "Iran":
					file = new File("bin/as/iran.png");
					gui.setImage(file);
					break;
				case "Iraq":
					file = new File("bin/as/iraq.png");
					gui.setImage(file);
					break;
				case "Israel":
					file = new File("bin/as/israel.png");
					gui.setImage(file);
					break;
				case "Japan":
					file = new File("bin/as/japan.png");
					gui.setImage(file);
					break;
				case "Jordan":
					file = new File("bin/as/jordan.png");
					gui.setImage(file);
					break;
				case "Kazakhstan":
					file = new File("bin/as/kazakhstan.png");
					gui.setImage(file);
					break;
				case "Kuwait":
					file = new File("bin/as/kuwait.png");
					gui.setImage(file);
					break;
				case "Kyrgyzstan":
					file = new File("bin/as/kyrgyzstan.png");
					gui.setImage(file);
					break;
				case "Laos":
					file = new File("bin/as/laos.png");
					gui.setImage(file);
					break;
				case "Lebanon":
					file = new File("bin/as/lebanon.png");
					gui.setImage(file);
					break;
				case "Malaysia":
					file = new File("bin/as/malaysia.png");
					gui.setImage(file);
					break;
				case "Maldives":
					file = new File("bin/as/maldives.png");
					gui.setImage(file);
					break;
				case "Mongolia":
					file = new File("bin/as/mongolia.png");
					gui.setImage(file);
					break;
				case "Myanmar":
					file = new File("bin/as/myanmar.png");
					gui.setImage(file);
					break;
				case "Nepal":
					file = new File("bin/as/nepal.png");
					gui.setImage(file);
					break;
				case "North Korea":
					file = new File("bin/as/northkorea.png");
					gui.setImage(file);
					break;
				case "Oman":
					file = new File("bin/as/oman.png");
					gui.setImage(file);
					break;
				case "Pakistan":
					file = new File("bin/as/pakistan.png");
					gui.setImage(file);
					break;
				case "Palestine":
					file = new File("bin/as/palestine.png");
					gui.setImage(file);
					break;
				case "Philippines":
					file = new File("bin/as/philippines.png");
					gui.setImage(file);
					break;
				case "Qatar":
					file = new File("bin/as/qatar.png");
					gui.setImage(file);
					break;
				case "Russia":
					file = new File("bin/as/russia.png");
					gui.setImage(file);
					break;
				case "Saudi Arabia":
					file = new File("bin/as/saudiarabia.png");
					gui.setImage(file);
					break;
				case "Singapore":
					file = new File("bin/as/singapore.png");
					gui.setImage(file);
					break;
				case "South Korea":
					file = new File("bin/as/southkorea.png");
					gui.setImage(file);
					break;
				case "Sri Lanka":
					file = new File("bin/as/srilanka.png");
					gui.setImage(file);
					break;
				case "Syria":
					file = new File("bin/as/syria.png");
					gui.setImage(file);
					break;
				case "Taiwan":
					file = new File("bin/as/taiwan.png");
					gui.setImage(file);
					break;
				case "Tajikistan":
					file = new File("bin/as/tajikistan.png");
					gui.setImage(file);
					break;
				case "Thailand":
					file = new File("bin/as/thailand.png");
					gui.setImage(file);
					break;
				case "Turkey":
					file = new File("bin/as/turkey.png");
					gui.setImage(file);
					break;
				case "Turkmenistan":
					file = new File("bin/as/turkmenistan.png");
					gui.setImage(file);
					break;
				case "United Arab Emirates":
					file = new File("bin/as/uae.png");
					gui.setImage(file);
					break;
				case "Uzbekistan":
					file = new File("bin/as/uzbekistan.png");
					gui.setImage(file);
					break;
				case "Vietnam":
					file = new File("bin/as/vietnam.png");
					gui.setImage(file);
					break;
				case "Yemen":
					file = new File("bin/as/yemen.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}