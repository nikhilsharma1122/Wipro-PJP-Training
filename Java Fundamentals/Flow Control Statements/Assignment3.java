package wipro;

public class training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("No Values");
		}
		else {
			for(int i = 0;i<args.length;i++) {
				System.out.println(args[i]);
				if(i < args.length-1) {
					System.out.println(", ");				}
			}
		}
	}
}
