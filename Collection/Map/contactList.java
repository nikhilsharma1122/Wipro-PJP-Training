package map;
import java.util.*;
import java.util.Map.Entry;
public class contactList {
	HashMap<String,Integer> contact = new HashMap();
	public void addContact(String name, Integer number) {
		contact.put(name, number);
	}
	public void getName(String name) {
		int num;
			num = contact.get(name);
			System.out.println("Provide Name: "+name+" : "+num);
	}
	public void getNumber(int number) {
		for(Object o:contact.keySet()) {
			if(contact.get(o).equals(number)) {
				System.out.println("Provide Number: "+number+" : "+o);
			}
		}
		
	}
	public void getDetails() {
		Set<Entry<String, Integer>> set = contact.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer>me = it.next();
			System.out.println("Details of the Contact : "+me);
		}
		
	}
}
