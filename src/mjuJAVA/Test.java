package mjuJAVA;

class Circle_1{
	
	public int radius;
	public String color;
	public Circle_1(int radius) {
	
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	

	public boolean equals(Circle c) {
		if(radius == c.radius) {
			return true;
		} else {
			return false;
		}
	}
	
};

public class Test {
	public static void main(String []args) {
		Circle_1 c1 = new Circle_1(10);
		Circle_1 c2 = new Circle_1(10);
		if(c1 == c2) { // 객체 비교
			System.out.println(" 2개의 원은 같습니다. ");
		} else {
			System.out.println("다릅니다.");
		}
		
		if(c1.equals(c2)) { // 재정의 후 radius만 비교
			System.out.println(" 2개의 원은 같습니다. ");
		} else {
			System.out.println("다릅니다.");
		}
		
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println();
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
	}
}
