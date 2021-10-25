package wipro;
import java.util.*;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet();
		TreeSet<String> setRev = new TreeSet();
		set.add("String 1");
		set.add("String 2");
		set.add("String 3");
		set.add("String 4");
		System.out.println("Original TreeSet: "+set);
		setRev = (TreeSet<String>) set.descendingSet();
		System.out.println(setRev);
		
		Iterator<String> it = set.iterator();
		String query = "String 8";
		while(it.hasNext()) {
			if(it.next().equals(query)) {
				System.out.println(query+" exist in the set");
				break;
				}
			else {
				System.out.println(query+ " doesnot exist in the set");
				break;
			}
		}
		
	}	

}
