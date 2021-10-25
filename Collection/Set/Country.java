package wipro;

public class country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetDemo h = new HashSetDemo();
		h.saveCountryName("India");
		h.saveCountryName("USA");
		h.saveCountryName("EI Salvador");
		h.saveCountryName("Russia");
		h.saveCountryName("Japan");
		h.saveCountryName("China");
		
		System.out.println("China: " + h.getCountry("China"));
        System.out.println("Japan: " + h.getCountry("Japan"));
		
	}

}
