import java.util.*;
public class optionalClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "earth";
		//String address = null;
		Optional<String> checkNull = Optional.ofNullable(address);
		System.out.println(checkNull.orElse("India"));
	}

}
