package wipro;
import java.util.*;
class MyArrayList<E> extends ArrayList<E>{
		@Override
		public boolean add(E e) {
			if(e instanceof Integer || e instanceof Float || e instanceof Double) {
				super.add(e);
				return true;
			}
			else {
				throw new ClassCastException("Only Integer, Float and Double are supported");
			}
		}
		
}
public class arrayListNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list= new MyArrayList<>();
		try {
			list.add(1);
			list.add(2.2F);
			list.add(3.1234);
			list.add(4);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}

}
