package map;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveCountry country=new saveCountry();
		
		country.saveCountryCapital("India", "Delhi");
		country.saveCountryCapital("Japan", "Tokyo");
		country.getCapital("India");
		System.out.println(country.getCountry("Tokyo"));
		HashMap<String,String> map2 = country.iteratorSwap();
		System.out.println(map2);
		System.out.println(country.toArrayListCountry());
		System.out.println(country.toArrayListCapital());
	}

}
