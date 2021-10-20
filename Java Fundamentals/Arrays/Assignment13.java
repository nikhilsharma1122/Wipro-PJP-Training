
public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 4) {
			System.out.println("Please enter 4 integer numbers");
			System.exit(1);
		}
		int[][] arr = {{Integer.parseInt(args[0]),Integer.parseInt(args[1])},
		{Integer.parseInt(args[2]), Integer.parseInt(args[3])}};
		System.out.println("The given array is : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr[i][j] +" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("The reverse of this array");
		for(int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
