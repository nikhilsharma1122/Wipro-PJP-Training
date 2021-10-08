package wipro;

public class stringPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = args[0];
		StringBuffer sbr =  new StringBuffer(str);
		sbr.reverse();
		String revStr =  sbr.toString();
		if(str.equals(revStr)) {
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("Not Palidrome");
		}
	}

}
