public class biggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 9) {
			System.out.println("Please enter 9 integer number");
			System.exit(1);
		}
		int max = 0;
		int[][] arr = {{Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])},
				{Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5])},
				{Integer.parseInt(args[6]),Integer.parseInt(args[7]),Integer.parseInt(args[8])}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			
		}
		System.out.println(max);
	}

}
