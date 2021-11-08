interface DigitCount{
	int digitCount(int n);
}
public class methodRef2 {
	public static int count(int n) {
		int count = Integer.toString(n).length();
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitCount dc = methodRef2::count;
		System.out.println("DigitCount of 500 : "+dc.digitCount(500));	
	}

}
