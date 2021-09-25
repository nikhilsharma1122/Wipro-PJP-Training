package wipro;

public class training {

	public static void main(String[] args) {
		for (int i = 10; i <= 99; i++) {
			if (isPrime(i)) System.out.println(i);
		}

	}
	
	public static boolean isPrime(int num) {
		if (num < 0) {
			num *= -1;
		}
		
		Boolean isPrime = true;
		
		for (int i = 2; i < num/2+1; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (num == 0 || num == 1) {
			isPrime = false;
		}
		
		return isPrime;
		
	}
}

