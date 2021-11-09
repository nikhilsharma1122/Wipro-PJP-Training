import java.time.LocalDate;
import java.time.LocalTime;

public class Date4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime t = LocalTime.now();
		System.out.println("Current Time : "+t);
		LocalTime t1 = t.plusMinutes(25);
		System.out.println(t1);
	}

}
