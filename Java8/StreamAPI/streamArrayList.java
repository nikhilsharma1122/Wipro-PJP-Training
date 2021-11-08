import java.util.*;
import java.util.stream.Collectors;
public class streamArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(-1, -2, -3, -4, -5, 1, 2, 3, 4, 5));
	        ArrayList<Integer> negEvens = (ArrayList<Integer>) nums.stream().filter(num -> num < 0)
	                .filter(num -> num % 2 == 0).collect(Collectors.toList());
	        negEvens.forEach(System.out::print);
	}

}
