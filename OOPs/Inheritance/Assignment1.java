package wipro;

class Animal{
	void eat() {
		System.out.println("Animal eat");
	}
	void sleep() {
		System.out.println("Animal sleep");	
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Bird eat");
	}
	void sleep() {
		System.out.println("Bird sleep");	
	}
	void fly() {
		System.out.println("Bird Fly");	
	}
}
public class animalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.eat();
		a.sleep();
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
