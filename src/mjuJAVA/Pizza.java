package mjuJAVA;

public class Pizza {
	private String toppings;
	int radius;
	static final double PI = 3.141592;
	static int count = 0;
	
	public Pizza(int r) {
		this.radius = r;
	}
	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}
	
	Pizza whosLargest(Pizza p1,Pizza p2) {
		if(p1.radius>p2.radius) {
			return p1;
		} else{
			return p2;
		}
	}
	//Parameter 하나 만으로도 가능
	Pizza whosLargest(Pizza p) {
		if(this.radius>p.radius) {
			return this;
		} else{
			return p;
		}
	}
	
	// static method는 static 변수만 사용 가능, this 사용 불가능, 인스턴트 method 호출 불가능
}	
