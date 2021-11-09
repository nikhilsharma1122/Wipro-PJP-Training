import java.time.LocalDate;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate date1 = today.plusDays(10);
		System.out.println(date1);
		
	}

}
