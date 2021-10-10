package wipro;

import java.util.Random;

abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "First Class Compartment";
	}
	
}
class Ladies extends Compartment{

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "Ladies Compartment";
	}
	
}
class General extends Compartment{

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "General Compartment";
	}
	
}
class Luggage extends Compartment{

	@Override
	public String notice() {
		// TODO Auto-generated method stub
		return "Luggage Compartment";
	}
	
}
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] com = new Compartment[10];
		Random rand = new Random();
		for (int i=0;i<com.length;i++) {
			int randNum = rand.nextInt(4) + 1;
			switch(randNum) {
			case 1: com[i] = new FirstClass();
			break;
			case 2: com[i] = new Ladies();
			break;
			case 3: com[i] = new General();
			break;
			case 4: com[i] = new Luggage();
			break;
			}
			System.out.println(com[i].notice());
		}
		
	}

}
