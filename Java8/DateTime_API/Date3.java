import java.time.LocalDate;

public class Date3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("Current Year "+today.getYear()+" is leap year ? "+today.isLeapYear());
	}

}
