package wipro;

public class Box {
	int w,h,d;
	Box(int width,int height, int depth){
		w = width;
		h = height;
		d = depth;
	}
	void showBox() {
		System.out.println("Volume = "+ w*h*d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(10,5,6);
		b.showBox();

	}

}
