package wipro;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = args[0];
		int pos = str.indexOf("*");
		StringBuffer sbr = new StringBuffer(str);
		sbr.delete(pos -1, pos +2);
		System.out.println(sbr);
	}

}
