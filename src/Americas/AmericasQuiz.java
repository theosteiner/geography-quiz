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
		final File f = new File("images/am/americasmap.png");
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
					file = new File("images/am/antiguaandbarbuda.png");
					gui.setImage(file);
					break;
				case "Argentina":
					file = new File("images/am/argentina.png");
					gui.setImage(file);
					break;
				case "Bahamas":
					file = new File("images/am/bahamas.png");
					gui.setImage(file);
					break;
				case "Barbados":
					file = new File("images/am/barbados.png");
					gui.setImage(file);
					break;
				case "Belize":
					file = new File("images/am/belize.png");
					gui.setImage(file);
					break;
				case "Bolivia":
					file = new File("images/am/bolivia.png");
					gui.setImage(file);
					break;
				case "Brazil":
					file = new File("images/am/brazil.png");
					gui.setImage(file);
					break;
				case "Canada":
					file = new File("images/am/canada.png");
					gui.setImage(file);
					break;
				case "Chile":
					file = new File("images/am/chile.png");
					gui.setImage(file);
					break;
				case "Colombia":
					file = new File("images/am/colombia.png");
					gui.setImage(file);
					break;
				case "Costa Rica":
					file = new File("images/am/costarica.png");
					gui.setImage(file);
					break;
				case "Cuba":
					file = new File("images/am/cuba.png");
					gui.setImage(file);
					break;
				case "Dominica":
					file = new File("images/am/dominica.png");
					gui.setImage(file);
					break;
				case "Dominican Republic":
					file = new File("images/am/dominicanrepublic.png");
					gui.setImage(file);
					break;
				case "Ecuador":
					file = new File("images/am/ecuador.png");
					gui.setImage(file);
					break;
				case "El Salvador":
					file = new File("images/am/elsalvador.png");
					gui.setImage(file);
					break;
				case "Grenada":
					file = new File("images/am/grenada.png");
					gui.setImage(file);
					break;
				case "Guatemala":
					file = new File("images/am/guatemala.png");
					gui.setImage(file);
					break;
				case "Guyana":
					file = new File("images/am/guyana.png");
					gui.setImage(file);
					break;
				case "Haiti":
					file = new File("images/am/haiti.png");
					gui.setImage(file);
					break;
				case "Honduras":
					file = new File("images/am/honduras.png");
					gui.setImage(file);
					break;
				case "Jamaica":
					file = new File("images/am/jamaica.png");
					gui.setImage(file);
					break;
				case "Mexico":
					file = new File("images/am/mexico.png");
					gui.setImage(file);
					break;
				case "Nicaragua":
					file = new File("images/am/nicaragua.png");
					gui.setImage(file);
					break;
				case "Panama":
					file = new File("images/am/panama.png");
					gui.setImage(file);
					break;
				case "Paraguay":
					file = new File("images/am/paraguay.png");
					gui.setImage(file);
					break;
				case "Peru":
					file = new File("images/am/peru.png");
					gui.setImage(file);
					break;
				case "Saint Kitts and Nevis":
					file = new File("images/am/stkittsandnevis.png");
					gui.setImage(file);
					break;
				case "Saint Lucia":
					file = new File("images/am/stlucia.png");
					gui.setImage(file);
					break;
				case "Saint Vincent and the Grenadines":
					file = new File("images/am/stvincentandthegrenadines.png");
					gui.setImage(file);
					break;
				case "Suriname":
					file = new File("images/am/suriname.png");
					gui.setImage(file);
					break;
				case "Trinidad and Tobago":
					file = new File("images/am/trinidadandtobago.png");
					gui.setImage(file);
					break;
				case "United States":
					file = new File("images/am/unitedstates.png");
					gui.setImage(file);
					break;
				case "Uruguay":
					file = new File("images/am/uruguay.png");
					gui.setImage(file);
					break;
				case "Venezuela":
					file = new File("images/am/venezuela.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}
