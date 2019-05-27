package Europe;
import java.util.ArrayList;
import Main.Continent;
import Main.Country;

public class Europe extends Continent
{	
	public Europe()
	{
		countries = new Country[] {new Country("Albania", "Tirana"), new Country("Andorra", "Andorra la Vella"), 
								   new Country("Austria", "Vienna"), new Country("Belarus", "Minsk"), 
								   new Country("Belgium", "Brussels"), new Country("Bosnia and Herzegovina", "Sarajevo"), 
								   new Country("Bulgaria", "Sofia"), new Country("Croatia", "Zagreb"), 
								   new Country("Cyprus", "Nicosia"), new Country("Czechia", "Prague"), 
								   new Country("Denmark", "Copenhagen"), new Country("Estonia", "Tallinn"), 
								   new Country("Finland", "Helsinki"), new Country("France", "Paris"), 
								   new Country("Germany", "Berlin"), new Country("Greece", "Athens"), 
								   new Country("Hungary", "Budapest"), new Country("Iceland", "Reykjavik"), 
								   new Country("Ireland", "Dublin"), new Country("Italy", "Rome"), 
								   new Country("Kosovo", "Pristina"), new Country("Latvia", "Riga"), 
								   new Country("Liechtenstein", "Vaduz"), new Country("Lithuania", "Vilnius"), 
								   new Country("Luxembourg", "Luxembourg City"), new Country("North Macedonia", "Skopje"), 
								   new Country("Malta", "Valletta"), new Country("Moldova", "Chisinau"), 
								   new Country("Monaco", "Monaco"), new Country("Montenegro", "Podgorica"), 
								   new Country("Netherlands", "Amsterdam"), new Country("Norway", "Oslo"), 
								   new Country("Poland", "Warsaw"), new Country("Portugal", "Lisbon"), 
								   new Country("Romania", "Bucharest"), new Country("Russia", "Moscow"), 
								   new Country("San Marino", "San Marino"), new Country("Serbia", "Belgrade"), 
								   new Country("Slovakia", "Bratislava"), new Country("Slovenia", "Ljubljana"), 
								   new Country("Spain", "Madrid"), new Country("Sweden", "Stockholm"), 
								   new Country("Switzerland", "Bern"), new Country("Turkey", "Ankara"), 
								   new Country("Ukraine", "Kiev"), new Country("United Kingdom", "London"), 
								   new Country("Vatican City", "Vatican City")};
		countryList = new ArrayList<Country>();
		addCountries(countries);
	}
}
