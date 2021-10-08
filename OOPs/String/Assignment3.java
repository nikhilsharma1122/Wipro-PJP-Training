package wipro;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer out = new StringBuffer("");
		int length = args[0].length();
		StringBuffer sbr = new StringBuffer(args[0]);
		sbr.delete(2, length);
		for(int i = 0;i<length;i++) {
			out.append(sbr);
		}
		System.out.println(out);
				
	}

}
