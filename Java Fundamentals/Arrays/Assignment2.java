package wipro;
import java.util.Arrays;

public class training {

	public static void main(String[] args) {
		int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(numbers);
		System.out.println("Maximum = "+numbers[numbers.length - 1]);
		System.out.println("Minimum = "+numbers[0]);
	}
}
