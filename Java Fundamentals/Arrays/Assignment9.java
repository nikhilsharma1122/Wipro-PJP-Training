  package wipro;

public class training {

	public static void main(String[] args) {
		if(args.length != 4) {
			System.out.println("Please enter 4 integer number");
		}
		
		int[][] arr = new int[2][2];
		int[][] arrRev = new int[2][2];
		int x = 0;
		for(int i = 0;i < arr.length; i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=Integer.parseInt(args[x++]);
			}
		}
		
		for(int i = 0;i < arr.length; i++) {
			for(int j=0;j<arr[0].length;j++) {
				arrRev[arr.length - 1 - i][arr.length - 1-j] = arr[i][j];
			}
		}
		System.out.println("The given array is : ");
		for(int i = 0;i < arr.length; i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The Reverse of the array is : ");
		for(int i = 0;i < arr.length; i++) {
			for(int j=0;j<arr[0].length;j++) {
				
				System.out.print(arrRev[i][j]+"\t");
			}
			System.out.println();
		
		}
	}
}
