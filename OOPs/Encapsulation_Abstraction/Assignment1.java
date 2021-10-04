package wipro;

class Author {
	String name;
	String email;
	char gen;
	
	Author(String name, String email, char gen){
		this.name = name;
		this.email = email;
		this.gen = gen;
	}
}
class Book1{
	String name;
	Author auth;
	double price;
	int qtyIntStock;
	
	
	Book1(String name, Author auth, double price, int qtyIntStock){
		this.name = name;
		this.auth = auth;
		this.price = price;
		this.qtyIntStock = qtyIntStock;
	}
	void getdetails() {
		System.out.printf("Book Details %n Name : %s %n Price: %f %n Quantity In Stock: %d %n", this.name, this.price, this.qtyIntStock);
        System.out.printf("Author Details %n Name : %s %n email : %s %n Gender: %C %n", this.auth.name, this.auth.email, this.auth.gen);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author auth = new Author("Ram","ram@gmail.com",'M');
		Book1 b = new Book1("Heaven - World", auth, 99.95, 5);
		b.getdetails();
	}

}
