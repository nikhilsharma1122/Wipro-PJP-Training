interface WordCount{
	int count(String str);
}
public class MyClassWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wc = str -> {
			return (str.split(" ").length);
		};
		System.out.println(wc.count("This is a test"));
	}

}
