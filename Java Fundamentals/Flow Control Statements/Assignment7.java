package wipro;

public class training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'a';
		if(Character.isLowerCase(ch1)) {
			System.out.println(ch1 + "->" + Character.toUpperCase(ch1));
		}
		else {
			System.out.println(ch1 + "->" + Character.toLowerCase(ch1));
		}
	}
}
