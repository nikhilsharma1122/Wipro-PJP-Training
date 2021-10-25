package wipro;
import java.util.*;
public class arrayList {
	public static void printAll(ArrayList<String> list) {
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
		list.add("String 4");
		printAll(list);
	}

}
