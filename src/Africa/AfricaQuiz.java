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
		final File f = new File("bin/af/africamap.png");
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
					file = new File("bin/af/algeria.png");
					gui.setImage(file);
					break;
				case "Angola":
					file = new File("bin/af/angola.png");
					gui.setImage(file);
					break;
				case "Benin":
					file = new File("bin/af/benin.png");
					gui.setImage(file);
					break;
				case "Botswana":
					file = new File("bin/af/botswana.png");
					gui.setImage(file);
					break;
				case "Burkina Faso":
					file = new File("bin/af/burkinafaso.png");
					gui.setImage(file);
					break;
				case "Burundi":
					file = new File("bin/af/burundi.png");
					gui.setImage(file);
					break;
				case "Cameroon":
					file = new File("bin/af/cameroon.png");
					gui.setImage(file);
					break;
				case "Cape Verde":
					file = new File("bin/af/capeverde.png");
					gui.setImage(file);
					break;
				case "Central African Republic":
					file = new File("bin/af/car.png");
					gui.setImage(file);
					break;
				case "Chad":
					file = new File("bin/af/chad.png");
					gui.setImage(file);
					break;
				case "Comoros":
					file = new File("bin/af/comoros.png");
					gui.setImage(file);
					break;
				case "Democratic Republic of the Congo":
					file = new File("bin/af/drc.png");
					gui.setImage(file);
					break;
				case "Republic of the Congo":
					file = new File("bin/af/congo.png");
					gui.setImage(file);
					break;
				case "Cote d'Ivoire":
					file = new File("bin/af/ivorycoast.png");
					gui.setImage(file);
					break;
				case "Djibouti":
					file = new File("bin/af/djibouti.png");
					gui.setImage(file);
					break;
				case "Egypt":
					file = new File("bin/af/egypt.png");
					gui.setImage(file);
					break;
				case "Equatorial Guinea":
					file = new File("bin/af/equatorialguinea.png");
					gui.setImage(file);
					break;
				case "Eritrea":
					file = new File("bin/af/eritrea.png");
					gui.setImage(file);
					break;
				case "Ethiopia":
					file = new File("bin/af/ethiopia.png");
					gui.setImage(file);
					break;
				case "Gabon":
					file = new File("bin/af/gabon.png");
					gui.setImage(file);
					break;
				case "Gambia":
					file = new File("bin/af/gambia.png");
					gui.setImage(file);
					break;
				case "Ghana":
					file = new File("bin/af/ghana.png");
					gui.setImage(file);
					break;
				case "Guinea":
					file = new File("bin/af/guinea.png");
					gui.setImage(file);
					break;
				case "Guinea-Bissau":
					file = new File("bin/af/guineabissau.png");
					gui.setImage(file);
					break;
				case "Kenya":
					file = new File("bin/af/kenya.png");
					gui.setImage(file);
					break;
				case "Lesotho":
					file = new File("bin/af/lesotho.png");
					gui.setImage(file);
					break;
				case "Liberia":
					file = new File("bin/af/liberia.png");
					gui.setImage(file);
					break;
				case "Libya":
					file = new File("bin/af/libya.png");
					gui.setImage(file);
					break;
				case "Madagascar":
					file = new File("bin/af/madagascar.png");
					gui.setImage(file);
					break;
				case "Malawi":
					file = new File("bin/af/malawi.png");
					gui.setImage(file);
					break;
				case "Mali":
					file = new File("bin/af/mali.png");
					gui.setImage(file);
					break;
				case "Mauritania":
					file = new File("bin/af/mauritania.png");
					gui.setImage(file);
					break;
				case "Mauritius":
					file = new File("bin/af/mauritius.png");
					gui.setImage(file);
					break;
				case "Morocco":
					file = new File("bin/af/morocco.png");
					gui.setImage(file);
					break;
				case "Mozambique":
					file = new File("bin/af/mozambique.png");
					gui.setImage(file);
					break;
				case "Namibia":
					file = new File("bin/af/namibia.png");
					gui.setImage(file);
					break;
				case "Niger":
					file = new File("bin/af/niger.png");
					gui.setImage(file);
					break;
				case "Nigeria":
					file = new File("bin/af/nigeria.png");
					gui.setImage(file);
					break;
				case "Rwanda":
					file = new File("bin/af/rwanda.png");
					gui.setImage(file);
					break;
				case "Sao Tome and Principe":
					file = new File("bin/af/saotomeandprincipe.png");
					gui.setImage(file);
					break;
				case "Senegal":
					file = new File("bin/af/senegal.png");
					gui.setImage(file);
					break;
				case "Seychelles":
					file = new File("bin/af/seychelles.png");
					gui.setImage(file);
					break;
				case "Sierra Leone":
					file = new File("bin/af/sierraleone.png");
					gui.setImage(file);
					break;
				case "Somalia":
					file = new File("bin/af/somalia.png");
					gui.setImage(file);
					break;
				case "South Africa":
					file = new File("bin/af/southafrica.png");
					gui.setImage(file);
					break;
				case "South Sudan":
					file = new File("bin/af/southsudan.png");
					gui.setImage(file);
					break;
				case "Sudan":
					file = new File("bin/af/sudan.png");
					gui.setImage(file);
					break;
				case "Swaziland":
					file = new File("bin/af/swaziland.png");
					gui.setImage(file);
					break;
				case "Tanzania":
					file = new File("bin/af/tanzania.png");
					gui.setImage(file);
					break;
				case "Togo":
					file = new File("bin/af/togo.png");
					gui.setImage(file);
					break;
				case "Tunisia":
					file = new File("bin/af/tunisia.png");
					gui.setImage(file);
					break;
				case "Uganda":
					file = new File("bin/af/uganda.png");
					gui.setImage(file);
					break;
				case "Zambia":
					file = new File("bin/af/zambia.png");
					gui.setImage(file);
					break;
				case "Zimbabwe":
					file = new File("bin/af/zimbabwe.png");
					gui.setImage(file);
					break;
			}
		}
		finishQuiz();
		return;
	}
}