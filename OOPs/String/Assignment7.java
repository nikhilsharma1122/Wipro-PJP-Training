package wipro;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = args[0];
		if(str.startsWith("x")) {
			str = str.substring(1,str.length());
		}
		else {
			str = str.substring(0, str.length()-1);
		}
		System.out.println(str);
	}

}
