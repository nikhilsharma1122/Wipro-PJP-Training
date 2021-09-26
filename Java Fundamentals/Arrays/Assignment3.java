package wipro;

public class training {

	public static void main(String[] args) {
		int[] number = {1,4,34,56,7};
		int search = 526, index = -1;
		for(int i = 0;i<number.length;i++) {
			if(number[i] == search) {
				index = i;
				break;
			}
		
		}
		System.out.println(index);
	}
}
