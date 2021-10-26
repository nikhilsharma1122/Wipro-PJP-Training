package map;
import java.util.*;
public class contactMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contactList list = new contactList();
		 list.addContact("A", 123);
		 list.addContact("B", 456);
		 list.addContact("C", 789);
		 list.getName("B");
		 list.getNumber(456);
		 list.getDetails();
	}

}
