package Asia;
import java.util.ArrayList;
import Main.Continent;
import Main.Country;

public class Asia extends Continent
{
	public Asia()
	{
		countries = new Country[] {new Country("Afghanistan", "Kabul"), new Country("Armenia", "Yerevan"), 
								   new Country("Azerbaijan", "Baku"), new Country("Bahrain", "Manama"), 
								   new Country("Bangladesh", "Dhaka"), new Country("Bhutan", "Thimphu"), 
								   new Country("Brunei", "Bandar Seri Begawan"), new Country("Cambodia", "Phnom Penh"), 
								   new Country("China", "Beijing"), new Country("Cyprus", "Nicosia"), 
								   new Country("East Timor", "Dili"), new Country("Georgia", "Tbilisi"), 
								   new Country("India", "New Delhi"), new Country("Indonesia", "Jakarta"), 
								   new Country("Iran", "Tehran"), new Country("Iraq", "Baghdad"), 
								   new Country("Israel", "Jerusalem"), new Country("Japan", "Tokyo"), 
								   new Country("Jordan", "Amman"), new Country("Kazakhstan", "Nur-Sultan"), 
								   new Country("Kuwait", "Kuwait City"), new Country("Kyrgyzstan", "Bishkek"), 
								   new Country("Laos", "Vientiane"), new Country("Lebanon", "Beirut"), 
								   new Country("Malaysia", "Kuala Lumpur"), new Country("Maldives", "Male"), 
								   new Country("Mongolia", "Ulaanbaatar"), new Country("Myanmar", "Naypyidaw"), 
								   new Country("Nepal", "Kathmandu"), new Country("North Korea", "Pyongyang"), 
								   new Country("Oman", "Muscat"), new Country("Pakistan", "Islamabad"), 
								   new Country("Palestine", "East Jerusalem"), new Country("Philippines", "Manila"), 
								   new Country("Qatar", "Doha"), new Country("Russia", "Moscow"), 
								   new Country("Saudi Arabia", "Riyadh"), new Country("Singapore", "Singapore"), 
								   new Country("South Korea", "Seoul"), new Country("Sri Lanka", "Sri Jayawardenepura Kotte"), 
								   new Country("Syria", "Damascus"), new Country("Taiwan", "Taipei"), 
								   new Country("Tajikistan", "Dushanbe"), new Country("Thailand", "Bangkok"), 
								   new Country("Turkey", "Ankara"), new Country("Turkmenistan", "Ashgabat"), 
								   new Country("United Arab Emirates", "Abu Dhabi"), new Country("Uzbekistan", "Tashkent"), 
								   new Country("Vietnam", "Hanoi"), new Country("Yemen", "Sana'a")};
		countryList = new ArrayList<Country>();
		addCountries(countries);
	}
}