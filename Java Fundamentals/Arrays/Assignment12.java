import java.util.Scanner;
public class middleway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array 1 : ");
		int[] arr1 = new int[3];
		for(int i = 0; i<arr1.length;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter Array 2 : ");
		int[] arr2 = new int[3];
		for(int i = 0; i<arr1.length;i++) {
			arr2[i] = scan.nextInt();
		}
		scan.close();
		int[] arr3 = new int[2];
		arr3[0] = arr1[1];
		arr3[1] = arr2[1];
		System.out.println(arr3[0]+" "+arr3[1]);
	}

}
