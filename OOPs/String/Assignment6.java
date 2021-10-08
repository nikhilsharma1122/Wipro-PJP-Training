package wipro;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = args[0];
		String str2 = args[1];
		String str;
		if(str1.length()>str2.length()) {
			str = str2 + str1 +str2;
			
		}
		else {
			str = str1 + str2 + str1;
		}
		System.out.println(str);
	}

}
