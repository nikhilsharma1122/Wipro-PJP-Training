import java.util.ArrayList;
import java.util.function.Function;

public class FunctionSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList();
		for(int i=0;i<10;i++) {
			arr.add(i);
		}
		int sum = 0;
		Function<ArrayList<Integer>,Integer> fn1 = x->{
			int total = 0;
			for(int n:x) {
				total += n;
			}
			return total;
		};
		sum  += fn1.apply(arr);
		System.out.println("Sum is: "+sum);
	}

}
