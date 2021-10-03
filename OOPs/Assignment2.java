package wipro;

public class Calculator {
	static int powerInt(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double a, int b) {
		return Math.pow(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("powerInt(2,3) : "+Calculator.powerInt(2, 3));
		System.out.println("powerDouble(3.5,2) : "+Calculator.powerDouble(3.5, 2));
	}

}
