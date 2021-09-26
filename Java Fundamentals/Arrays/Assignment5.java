package wipro;

import java.util.Arrays;

public class training {

	public static void main(String[] args) {
		int[] number = {1,5,4,3,2,6};
		Arrays.sort(number);
		System.out.println("Smallest two number in the array: "+number[0] + " and " + number[1]);
		System.out.println("Largest two number in the array: "+number[number.length-1] + " and " + number[number.length - 2]);
		
	}
}
