package wipro;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = args[0].length();
		if(length%2 == 0) {
			System.out.println(args[0].substring(0,length/2));
		}
		else {
			System.out.println("null");
		}
				
	}

}
