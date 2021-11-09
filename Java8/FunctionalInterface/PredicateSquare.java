import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList(Arrays.asList(1, 3, 4, 10, 16, 24, 30, 36, 42, 49));
		Predicate<Integer> p1 = num->{
			int n = (int)Math.sqrt(num);
			if((double) n == Math.sqrt(num)) {
				return true;
			}
			else {
				return false;
			}
		};
		arr.stream().filter(p1).forEach(System.out::println);
	}

}
