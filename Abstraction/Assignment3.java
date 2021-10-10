package wipro;

abstract class Instrument{
	public abstract String play();
}
class Piano	extends Instrument{

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Piano is playing tan tan tan tan";
	}
	
}
class Flute extends Instrument{

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Flute is playing toot toot toot toot";
	}
	
}
class Guitar extends Instrument{

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Guitar is playing tin tin tin";
	}
	
}

public class TestInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument[] ins = new Instrument[10];
		for (int i =0; i<ins.length;i++) {
			if(i == 1 || i == 4 || i == 7) {
				ins[i] = new Piano();
			}
			else if(i == 2 || i == 6 || i == 8) {
				ins[i] = new Flute();
			}
			else {
				ins[i] = new Guitar();
			}
			ins[i].play();
			if(ins[i] instanceof Piano) {
				System.out.println("> Instance of Piano");
			}
			else if(ins[i] instanceof Flute) {
				System.out.println("> Instance of Flute");
			}
			else {
				System.out.println("> Instance of Guitar");
			}
		}
	}

}
