package mjuJAVA;

public class PizzaTest {
	public static void main(String[] args) {
		Pizza p1 = new Pizza(30);
		Pizza p2 = new Pizza(40);
		Pizza largest = p1.whosLargest(p1,p2);
		System.out.println(largest.radius+"이/가 더 큽니다.");
		Pizza largest2 = p1.whosLargest(p2);
		System.out.println(largest2.radius+"이/가 더 큽니다.");
		
		Pizza p3 = new Pizza("Super supreme");
		int n = Pizza.count;
		System.out.println("지금까지 만들어진 피자의 종류: "+n);
	}
}
