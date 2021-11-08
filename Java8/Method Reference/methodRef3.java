interface CheckPrime{
	void prime(int n);
}
public class methodRef3 {
	methodRef3(int n){
		boolean isPrime = true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPrime p = methodRef3::new;
		System.out.println("257 is prime or not ? : ");
		p.prime(257);
	}

}
