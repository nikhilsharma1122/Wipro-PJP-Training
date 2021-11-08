interface Vehicle{
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
public class car implements Vehicle, FourWheeler {
	@Override
	public void message() {
		Vehicle.super.message();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		c.message();
	}

}
