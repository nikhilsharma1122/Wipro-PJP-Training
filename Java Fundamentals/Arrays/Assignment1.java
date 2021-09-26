package wipro;
import java.util.Arrays;

public class training {

	public static void main(String[] args) {
		int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
		int sum=0,i=0;
		double average;
		for(int number:numbers) {
			sum += number;
		}
		int arrayLength = numbers.length;
		average = ((double)sum/(double)arrayLength);
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);
	}
}
