import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
public class PredicateStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("PHP", "LOL", "Dial", "Tears", "Hard", "Racecar", "Level", "Crazy", "Madam", "Potato","abccba"));
		Predicate<String> p1 = s->{
			String input1 = s.toLowerCase();
			int count = input1.length();
			boolean isPalindrome = true;
			int range = count/2;
			if(count%2==0) {
				range--;
			}
			for(int i=0;i<=range;i++) {
				if(input1.charAt(i)!=input1.charAt(count-i-1)) {
					isPalindrome = false;
				}
			}
			return isPalindrome;
		};
		arr.stream().filter(p1).forEach(System.out::println);
	}

}
