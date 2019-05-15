package Main;
import java.util.List;

public class Continent
{
	protected Country[] countries;
	protected List<Country> countryList;
	
	public List<Country> getCountryList()
	{
		return countryList;
	}
	public void addCountries(Country[] countries)
	{
		for (Country c : countries)
		{
			countryList.add(c);
		}
	}
}