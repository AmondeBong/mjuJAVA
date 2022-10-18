package mjuJAVA;

public class Rect {
	int width, height;
	public Rect(int w,int h) {
		width = w;
		height = h;
	}
	
	double getArea() {
		return (double)width*height;
	}
}
