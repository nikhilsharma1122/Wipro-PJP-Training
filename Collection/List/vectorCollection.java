package wipro;
import java.util.*;
public class vectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		Vector<Integer> v = new Vector<Integer>(n);
		//adding new element
		
		for(int i =0 ;i<n;i++) {
			v.add(i);
		}
		//Enumeration for printing
		Enumeration en = v.elements();
		System.out.println("Print Vector Elements using ENUMERATION -------");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println("Print Vector Elements using ITERATOR -------");
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}	

}
