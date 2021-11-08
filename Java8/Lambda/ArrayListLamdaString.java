import java.util.*;
public class ArrayListLamdaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StringBuffer> list = new ArrayList<StringBuffer>();
		String[] names = {"Java", "Python", "C++", "C", "JavaScript", "Go", "Rust", "Bash", "Haskell", "Ruby"};
		for(String name:names) {
			StringBuffer sbr = new StringBuffer(name);
			list.add(sbr);
		}
		list.forEach(name->System.out.println(name.reverse()));
	}

}
