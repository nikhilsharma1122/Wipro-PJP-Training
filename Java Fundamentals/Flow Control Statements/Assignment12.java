package wipro;

public class training {

	public static void main(String[] args) {

		int n = -4;
		Boolean isPrime = true;
		
		if (n < 0) 
		{
			n = n * -1;
		}
		
		for (int i = 2; i < n/2 + 1; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (n == 0 || n == 1) isPrime = false;
		
		if (isPrime) 
			{
			System.out.println("prime");
			}
		else 
			{
			System.out.println("not prime");
			}
	}

}
