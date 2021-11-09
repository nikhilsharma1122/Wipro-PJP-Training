import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoiner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("C", "C++", "Java", "Python", "JavaScript"));
		StringJoiner joiner = new StringJoiner(",","{","}");
		arr.forEach(s->joiner.add(s));
		System.out.println(joiner.toString());
	}

}
