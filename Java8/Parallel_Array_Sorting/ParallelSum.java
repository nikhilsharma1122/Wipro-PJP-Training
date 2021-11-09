import java.util.Arrays;

public class ParallelSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {6,4,5,3,2,8,1,9,7,10};
		Arrays.parallelSort(arr);
		/*for(int i:arr) {
			System.out.println(i);
		}*/
		int sum = arr[0]+arr[9];
		System.out.println(sum);
		
		
		
	}

}
