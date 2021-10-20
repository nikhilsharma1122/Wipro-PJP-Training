import java.util.*;
import java.util.Scanner;
public class exceptionArray {
	public static void main(String[] args) {
		System.out.println("Enter the array size :\n ");
		
		Scanner scan = new Scanner(System.in);
		int size  = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: \n");
		for(int i=0;i<size;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access : \n");
		int index = scan.nextInt();
		try {
			System.out.println("The array element at index 1 = "+arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException | InputMismatchException e) {
			System.out.println(e);
		}
		
	}
}
