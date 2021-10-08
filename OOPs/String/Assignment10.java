package wipro;

public class testString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbr = new StringBuffer("");
		int n = Integer.parseInt(args[1]);
		StringBuffer sbr1 = new StringBuffer(args[0]);
		sbr1.delete(0, sbr1.length()- 3);
		for(int i = 0; i < n; i++) {
			sbr.append(sbr1);
		}
		System.out.println(sbr);
		
	}

}
