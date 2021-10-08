package wipro;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = args[0];
		String str2 = args[1];
		String str;
		char firstSec = str2.charAt(0);
		if(str1.endsWith(Character.toString(firstSec).toLowerCase())) {
			StringBuffer sbr = new StringBuffer(str2);
			sbr.deleteCharAt(0);
			str2 = sbr.toString();
			str = str1+str2;
		}
		else {
			str = str1 + " " +str2;
		}
		System.out.println(str.toLowerCase());
	}

}
