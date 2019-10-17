package Africa;
import java.util.ArrayList;
import Main.Continent;
import Main.Country;

public class Africa extends Continent
{	
	public Africa()
	{
		countries = new Country[] {new Country("Algeria", "Algiers"), new Country("Angola", "Luanda"), 
					 			   new Country("Benin", "Porto-Novo"), new Country("Botswana", "Gaborone"), 
					 			   new Country("Burkina Faso", "Ouagadougou"), new Country("Burundi", "Gitega"), 
					 			   new Country("Cameroon", "Yaounde"), new Country("Cape Verde", "Praia"), 
					 			   new Country("Central African Republic", "Bangui"), new Country("Chad", "N'Djamena"), 
					 			   new Country("Comoros", "Moroni"), new Country("Democratic Republic of the Congo", "Kinshasa"), 
					 			   new Country("Republic of the Congo", "Brazzaville"), new Country("Cote d'Ivoire", "Yamoussoukro"), 
					 			   new Country("Djibouti", "Djibouti"), new Country("Egypt", "Cairo"), 
					 			   new Country("Equatorial Guinea", "Malabo"), new Country("Eritrea", "Asmara"), 
					 			   new Country("Ethiopia", "Addis Ababa"), new Country("Gabon", "Libreville"), 
					 			   new Country("Gambia", "Banjul"), new Country("Ghana", "Accra"), 
					 			   new Country("Guinea", "Conakry"), new Country("Guinea-Bissau", "Bissau"), 
					 			   new Country("Kenya", "Nairobi"), new Country("Lesotho", "Maseru"), 
					 			   new Country("Liberia", "Monrovia"), new Country("Libya", "Tripoli"), 
					 			   new Country("Madagascar", "Antananarivo"), new Country("Malawi", "Lilongwe"), 
					 			   new Country("Mali", "Bamako"), new Country("Mauritania", "Nouakchott"), 
					 			   new Country("Mauritius", "Port Louis"), new Country("Morocco", "Rabat"), 
					 			   new Country("Mozambique", "Maputo"), new Country("Namibia", "Windhoek"), 
					 			   new Country("Niger", "Niamey"), new Country("Nigeria", "Abuja"), 
					 			   new Country("Rwanda", "Kigali"), new Country("Sao Tome and Principe", "Sao Tome"), 
					 			   new Country("Senegal", "Dakar"), new Country("Seychelles", "Victoria"), 
					 			   new Country("Sierra Leone", "Freetown"), new Country("Somalia", "Mogadishu"), 
					 			   new Country("South Africa", "Pretoria, Cape Town, and Bloemfontein"), new Country("South Sudan", "Juba"), 
					 			   new Country("Sudan", "Khartoum"), new Country("Eswatini", "Mbabane and Lobamba"), 
					 			   new Country("Tanzania", "Dodoma"), new Country("Togo", "Lome"), 
					 			   new Country("Tunisia", "Tunis"), new Country("Uganda", "Kampala"), 
					 			   new Country("Zambia", "Lusaka"), new Country("Zimbabwe", "Harare")};
		countryList = new ArrayList<Country>();
		addCountries(countries);
	}
}
