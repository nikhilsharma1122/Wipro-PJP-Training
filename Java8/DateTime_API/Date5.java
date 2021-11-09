import java.time.LocalDate;
import java.time.LocalTime;

public class Date5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime t = LocalTime.now();
		System.out.println("Current Time : "+t);
		LocalTime t1 = t.minusHours(5).minusMinutes(30);
		System.out.println(t1);
	}

}
