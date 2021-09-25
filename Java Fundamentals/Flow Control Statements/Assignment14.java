package wipro;

public class training {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Please enter a number");
		}
		int num = Integer.parseInt(args[0]);
		if(num == 0 || num == 1) {
			System.out.println(num + " is not prime nor composite");
		}
		else {
			if(isPrime(num)) {
				System.out.println(num+" is a prime number");
			}
			else {
				System.out.println(num+" is not a prime number");
			}
		}
	
}

public static boolean isPrime(int pn) {
	if(pn < -1) {
		pn = pn*-1;
	}
	Boolean isPrime=true;
	for(int i = 2;i < pn/2 + 1;i++) {
		if(pn%i == 0) {
			isPrime = false;
			break;
		}
	}
	if (pn == 0 || pn == 1)
		{
			return isPrime;
		}
	return isPrime;
	}
}

