package wipro;
import java.util.*;

public class HashSetDemo {
	HashSet<String> set = new HashSet();
	public HashSet<String> saveCountryName(String country){
		set.add(country);
		return set;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			if(it.next().equals(CountryName))
				
				return CountryName;
		}
		return null;
	}

}
