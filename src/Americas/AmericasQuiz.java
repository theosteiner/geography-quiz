package Americas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import Main.MainGUI;
import Main.Quiz;

public class AmericasQuiz extends Quiz
{
	public AmericasQuiz()
	{
		super();
		final File f = new File("bin/am/americasmap.png");
		quizDialog.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				quizDialog.dispose();
				AmericasGUI.frame.dispose();
				gui.setImage(f);
				MainGUI.getMainFrame().setVisible(true);
				MainGUI.getDialog().setVisible(true);
			}
		});
		quizDialog.setLocation(1070, 225);
		quizDialog.setVisible(true);
		name = "Americas";
		continent = new Americas();
		gui = new AmericasGUI();
	}
	public void makeQuiz()
	{
		super.initQuiz();
		if (!isEmpty())
		{
			switch (pickRandomCountry().getName())
			{
				case "Antigua and Barbuda":
					file = new File("bin/am/antiguaandbarbuda.png");
					gui.setImage(file);
					break;
				case "Argentina":
					file = new File("bin/am/argentina.png");
					gui.setImage(file);
					break;
				case "Bahamas":
					file = new File("bin/am/bahamas.png");
					gui.setImage(file);
					break;
				case "Barbados":
					file = new File("bin/am/barbados.png");
					gui.setImage(file);
					break;
				case "Belize":
					file = new File("bin/am/belize.png");
					gui.setImage(file);
					break;
				case "Bolivia":
					file = new File("bin/am/bolivia.png");
					gui.setImage(file);
					break;
				case "Brazil":
					file = new File("bin/am/brazil.png");
					gui.setImage(file);
					break;
				case "Canada":
					file = new File("bin/am/canada.png");
					gui.setImage(file);
					break;
				case "Chile":
					file = new File("bin/am/chile.png");
					gui.setImage(file);
					break;
				case "Colombia":
					file = new File("bin/am/colombia.png");
					gui.setImage(file);
					break;
				case "Costa Rica":
					file = new File("bin/am/costarica.png");
					gui.setImage(file);
					break;
				case "Cuba":
					file = new File("bin/am/cuba.png");
					gui.setImage(file);
					break;
				case "Dominica":
					file = new File("bin/am/dominica.png");
					gui.setImage(file);
					break;
				case "Dominican Republic":
					file = new File("bin/am/dominicanrepublic.png");
					gui.setImage(file);
					break;
				case "Ecuador":
					file = new File("bin/am/ecuador.png");
					gui.setImage(file);
					break;
				case "El Salvador":
					file = new File("bin/am/elsalvador.png");
					gui.setImage(file);
					break;
				case "Grenada":
					file = new File("bin/am/grenada.png");
					gui.setImage(file);
					break;
				case "Guatemala":
					file = new File("bin/am/guatemala.png");
					gui.setImage(file);
					break;
				case "Guyana":
					file = new File("bin/am/guyana.png");
					gui.setImage(file);
					break;
				case "Haiti":
					file = new File("bin/am/haiti.png");
					gui.setImage(file);
					break;
				case "Honduras":
					file = new File("bin/am/honduras.png");
					gui.setImage(file);
					break;
				case "Jamaica":
					file = new File("bin/am/jamaica.png");
					gui.setImage(file);
					break;
				case "Mexico":
					file = new File("bin/am/mexico.png");
					gui.setImage(file);
					break;
				case "Nicaragua":
					file = new File("bin/am/nicaragua.png");
					gui.setImage(file);
					break;
				case "Panama":
					file = new File("bin/am/panama.png");
					gui.setImage(file);
					break;
				case "Paraguay":
					file = new File("bin/am/paraguay.png");
					gui.setImage(file);
					break;
				case "Peru":
					file = new File("bin/am/peru.png");
					gui.setImage(file);
					break;
				case "Saint Kitts and Nevis":
					file = new File("bin/am/stkittsandnevis.png");
					gui.setImage(file);
					break;
				case "Saint Lucia":
					file = new File("bin/am/stlucia.png");
					gui.setImage(file);
					break;
				case "Saint Vincent and the Grenadines":
					file = new File("bin/am/stvincentandthegrenadines.png");
					gui.setImage(file);
					break;
				case "Suriname":
					file = new File("bin/am/suriname.png");
					gui.setImage(file);
					break;
				case "Trinidad and Tobago":
					file = new File("bin/am/trinidadandtobago.png");
					gui.setImage(file);
					break;
				case "United States":
					file = new File("bin/am/unitedstates.png");
					gui.setImage(file);
					break;
				case "Uruguay":
					file = new File("bin/am/uruguay.png");
					gui.setImage(file);
					break;
				case "Venezuela":
					file = new File("bin/am/venezuela.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}