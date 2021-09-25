package wipro;

public class training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		
		if(!gender.equals("Male") && !gender.equals("Female")) {
			System.out.println("Invalid gender");
		}
		if(age<1 || age>=120) {
			System.out.println("Invalid age");
		}
		if(gender.equals("Female") && (age >=1 && age <= 58)) {
			System.out.println("The percentage of interest is 8.2%");
		}
		else if(gender.equals("Female") && (age >= 59 && age <= 120)) {
			System.out.println("The percentage of interest is 7.6%");
		}
		else if(gender.equals("Male") && (age >=1 && age <= 60)) {
			System.out.println("The percentage of interest is 9.2%");
		}
		else if(gender.equals("Male") && (age >= 61 && age <= 120)) {
			System.out.println("The percentage of interest is 8.3%");
		}
	}
}
