interface Factorial{
	int factorial(int n);
}
public class methodRef1 {
	public int fact(int n) {
		int fact =1;
		while(n>0) {
			fact *= n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodRef1 ref1  = new methodRef1();
		Factorial f = ref1::fact;
		System.out.println("Factorial of 5 : "+f.factorial(5));
	}

}
