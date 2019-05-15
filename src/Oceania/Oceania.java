package Oceania;
import java.util.ArrayList;
import Main.Continent;
import Main.Country;

public class Oceania extends Continent
{
	public Oceania()
	{
		countries = new Country[] {new Country("Australia", "Canberra"), new Country("Fiji", "Suva"), 
								   new Country("Kiribati", "Tarawa"), new Country("Marshall Islands", "Majuro"), 
								   new Country("Micronesia", "Palikir"), new Country("Nauru", "Yaren"), 
								   new Country("New Zealand", "Wellington"), new Country("Palau", "Ngerulmud"), 
								   new Country("Papua New Guinea", "Port Moresby"), new Country("Samoa", "Apia"), 
								   new Country("Solomon Islands", "Honiara"), new Country("Tonga", "Nuku'alofa"), 
								   new Country("Tuvalu", "Funafuti"), new Country("Vanuatu", "Port Vila")};
		countryList = new ArrayList<Country>();
		addCountries(countries);
	}
}