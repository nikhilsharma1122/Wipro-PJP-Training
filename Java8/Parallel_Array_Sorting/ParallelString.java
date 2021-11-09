import java.util.Arrays;
import java.util.Scanner;

public class ParallelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.next();
		sc.close();
		char[] ch = s.toCharArray();
		/*for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}*/
		Arrays.parallelSort(ch);
		String out = "";
		for(char c:ch) {
			out += c;
		}
		System.out.println(out);
	}

}
