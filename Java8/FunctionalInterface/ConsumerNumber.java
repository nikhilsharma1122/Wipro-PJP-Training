import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList();
		for(int i=1;i<=10;i++) {
			arr.add(i);
		}
		Consumer<Integer> c1 = x->{
			if(x%2==0) {
				System.out.println(x+" Even");
			}
			else {
				System.out.println(x+" Odd");
			}
		};
		arr.forEach(n->c1.accept(n));
		
	}

}
