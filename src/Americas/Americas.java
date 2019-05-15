package Americas;
import java.util.ArrayList;
import Main.Continent;
import Main.Country;

public class Americas extends Continent
{	
	public Americas()
	{
		countries = new Country[] {new Country("Antigua and Barbuda", "St. John's"), new Country("Argentina", "Buenos Aires"), 
								   new Country("Bahamas", "Nassau"), new Country("Barbados", "Bridgetown"),
								   new Country("Belize", "Belmopan"), new Country("Bolivia", "La Paz and Sucre"),
								   new Country("Brazil", "Brasilia"), new Country("Canada", "Ottawa"),
								   new Country("Chile", "Santiago"), new Country("Colombia", "Bogota"),
								   new Country("Costa Rica", "San Jose"), new Country("Cuba", "Havana"),
								   new Country("Dominica", "Roseau"), new Country("Dominican Republic", "Santo Domingo"),
								   new Country("Ecuador", "Quito"), new Country("El Salvador", "San Salvador"),
								   new Country("Grenada", "St. George's"), new Country("Guatemala", "Guatemala City"),
								   new Country("Guyana", "Georgetown"), new Country("Haiti", "Port-au-Prince"),
								   new Country("Honduras", "Tegucigalpa"), new Country("Jamaica", "Kingston"),
								   new Country("Mexico", "Mexico City"), new Country("Nicaragua", "Managua"),
								   new Country("Panama", "Panama City"), new Country("Paraguay", "Asuncion"),
								   new Country("Peru", "Lima"), new Country("Saint Kitts and Nevis", "Basseterre"),
								   new Country("Saint Lucia", "Castries"), new Country("Saint Vincent and the Grenadines", "Kingstown"),
								   new Country("Suriname", "Paramaribo"), new Country("Trinidad and Tobago", "Port of Spain"),
								   new Country("United States", "Washington D.C."), new Country("Uruguay", "Montevideo"),
								   new Country("Venezuela", "Caracas")};
		countryList = new ArrayList<Country>();
		addCountries(countries);
	}
}