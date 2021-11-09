import java.util.*;
public class optionalClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		Optional<String> checkNull  = Optional.ofNullable(names[0]);
		if(checkNull.isPresent()) {
			System.out.println(names[0].length());
		}
		else {
			System.out.println("Value is null");
		}
	}

}
