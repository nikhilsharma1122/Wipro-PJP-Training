import java.util.*;
public class ArrayListLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random	my_rand = new Random();
		ArrayList<Integer> al=new ArrayList<Integer>();	
		for(int i=0;i<25;i++) {
			int v_1 = my_rand.nextInt(100);
			al.add(v_1);
		}
		System.out.println("Print all the numbers present in the list using lambda expression");
		al.forEach(n->{
			boolean isPrime =true;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime = false;
					break;
				}
			}
			System.out.println(isPrime ? n +" ":"");
		});
		System.out.println(al);
	}
}
