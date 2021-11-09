import java.time.LocalDate;
import java.time.Period;

public class DateExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start = LocalDate.parse("2021-10-11");
		LocalDate now = LocalDate.now();
		Period p = Period.between(start, now);
		System.out.println("Year : "+p.getYears()+" Months : "+p.getMonths()+" Days : "+p.getDays());
	}

}
