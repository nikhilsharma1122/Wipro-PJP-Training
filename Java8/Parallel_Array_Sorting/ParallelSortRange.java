import java.util.Arrays;

public class ParallelSortRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 4, 1, 3, 6, 7, 8, 9, 2, 5 };
		Arrays.parallelSort(arr,0,5);
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
