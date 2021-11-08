import java.util.*;
public class forEach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList();
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.forEach(day->System.out.println(day));
	}

}
