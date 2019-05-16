package Africa;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import Main.MainGUI;
import Main.Quiz;

public class AfricaQuiz extends Quiz
{	
	public AfricaQuiz()
	{
		super();
		final File f = new File("images/af/africamap.png");
		quizDialog.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				quizDialog.dispose();
				AfricaGUI.frame.dispose();
				gui.setImage(f);
				MainGUI.getMainFrame().setVisible(true);
				MainGUI.getDialog().setVisible(true);
			}
		});
		quizDialog.setLocation(1163, 200);
		quizDialog.setVisible(true);
		name = "Africa";
		continent = new Africa();
		gui = new AfricaGUI();
	}
	public void makeQuiz()
	{
		super.initQuiz();
		if (!isEmpty())
		{
			switch (pickRandomCountry().getName())
			{
				case "Algeria":
					file = new File("images/af/algeria.png");
					gui.setImage(file);
					break;
				case "Angola":
					file = new File("images/af/angola.png");
					gui.setImage(file);
					break;
				case "Benin":
					file = new File("images/af/benin.png");
					gui.setImage(file);
					break;
				case "Botswana":
					file = new File("images/af/botswana.png");
					gui.setImage(file);
					break;
				case "Burkina Faso":
					file = new File("images/af/burkinafaso.png");
					gui.setImage(file);
					break;
				case "Burundi":
					file = new File("images/af/burundi.png");
					gui.setImage(file);
					break;
				case "Cameroon":
					file = new File("images/af/cameroon.png");
					gui.setImage(file);
					break;
				case "Cape Verde":
					file = new File("images/af/capeverde.png");
					gui.setImage(file);
					break;
				case "Central African Republic":
					file = new File("images/af/car.png");
					gui.setImage(file);
					break;
				case "Chad":
					file = new File("images/af/chad.png");
					gui.setImage(file);
					break;
				case "Comoros":
					file = new File("images/af/comoros.png");
					gui.setImage(file);
					break;
				case "Democratic Republic of the Congo":
					file = new File("images/af/drc.png");
					gui.setImage(file);
					break;
				case "Republic of the Congo":
					file = new File("images/af/congo.png");
					gui.setImage(file);
					break;
				case "Cote d'Ivoire":
					file = new File("images/af/ivorycoast.png");
					gui.setImage(file);
					break;
				case "Djibouti":
					file = new File("images/af/djibouti.png");
					gui.setImage(file);
					break;
				case "Egypt":
					file = new File("images/af/egypt.png");
					gui.setImage(file);
					break;
				case "Equatorial Guinea":
					file = new File("images/af/equatorialguinea.png");
					gui.setImage(file);
					break;
				case "Eritrea":
					file = new File("images/af/eritrea.png");
					gui.setImage(file);
					break;
				case "Ethiopia":
					file = new File("images/af/ethiopia.png");
					gui.setImage(file);
					break;
				case "Gabon":
					file = new File("images/af/gabon.png");
					gui.setImage(file);
					break;
				case "Gambia":
					file = new File("images/af/gambia.png");
					gui.setImage(file);
					break;
				case "Ghana":
					file = new File("images/af/ghana.png");
					gui.setImage(file);
					break;
				case "Guinea":
					file = new File("images/af/guinea.png");
					gui.setImage(file);
					break;
				case "Guinea-Bissau":
					file = new File("images/af/guineabissau.png");
					gui.setImage(file);
					break;
				case "Kenya":
					file = new File("images/af/kenya.png");
					gui.setImage(file);
					break;
				case "Lesotho":
					file = new File("images/af/lesotho.png");
					gui.setImage(file);
					break;
				case "Liberia":
					file = new File("images/af/liberia.png");
					gui.setImage(file);
					break;
				case "Libya":
					file = new File("images/af/libya.png");
					gui.setImage(file);
					break;
				case "Madagascar":
					file = new File("images/af/madagascar.png");
					gui.setImage(file);
					break;
				case "Malawi":
					file = new File("images/af/malawi.png");
					gui.setImage(file);
					break;
				case "Mali":
					file = new File("images/af/mali.png");
					gui.setImage(file);
					break;
				case "Mauritania":
					file = new File("images/af/mauritania.png");
					gui.setImage(file);
					break;
				case "Mauritius":
					file = new File("images/af/mauritius.png");
					gui.setImage(file);
					break;
				case "Morocco":
					file = new File("images/af/morocco.png");
					gui.setImage(file);
					break;
				case "Mozambique":
					file = new File("images/af/mozambique.png");
					gui.setImage(file);
					break;
				case "Namibia":
					file = new File("images/af/namibia.png");
					gui.setImage(file);
					break;
				case "Niger":
					file = new File("images/af/niger.png");
					gui.setImage(file);
					break;
				case "Nigeria":
					file = new File("images/af/nigeria.png");
					gui.setImage(file);
					break;
				case "Rwanda":
					file = new File("images/af/rwanda.png");
					gui.setImage(file);
					break;
				case "Sao Tome and Principe":
					file = new File("images/af/saotomeandprincipe.png");
					gui.setImage(file);
					break;
				case "Senegal":
					file = new File("images/af/senegal.png");
					gui.setImage(file);
					break;
				case "Seychelles":
					file = new File("images/af/seychelles.png");
					gui.setImage(file);
					break;
				case "Sierra Leone":
					file = new File("images/af/sierraleone.png");
					gui.setImage(file);
					break;
				case "Somalia":
					file = new File("images/af/somalia.png");
					gui.setImage(file);
					break;
				case "South Africa":
					file = new File("images/af/southafrica.png");
					gui.setImage(file);
					break;
				case "South Sudan":
					file = new File("images/af/southsudan.png");
					gui.setImage(file);
					break;
				case "Sudan":
					file = new File("images/af/sudan.png");
					gui.setImage(file);
					break;
				case "Swaziland":
					file = new File("images/af/swaziland.png");
					gui.setImage(file);
					break;
				case "Tanzania":
					file = new File("images/af/tanzania.png");
					gui.setImage(file);
					break;
				case "Togo":
					file = new File("images/af/togo.png");
					gui.setImage(file);
					break;
				case "Tunisia":
					file = new File("images/af/tunisia.png");
					gui.setImage(file);
					break;
				case "Uganda":
					file = new File("images/af/uganda.png");
					gui.setImage(file);
					break;
				case "Zambia":
					file = new File("images/af/zambia.png");
					gui.setImage(file);
					break;
				case "Zimbabwe":
					file = new File("images/af/zimbabwe.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}
