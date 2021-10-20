public class InvalidCountryException extends Exception {
	InvalidCountryException(){
		System.out.println("InvalidCountryException should be thrown");
		System.out.println("User Outside India cannot be registered");
	}
}
