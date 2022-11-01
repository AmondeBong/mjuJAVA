package mjuJAVA;

class Parent{
	void print() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println("make Child");
	}
	@Override
	void print() {
		System.out.println("Child");
	}
}
public class Casting {
	public static void main(String[] args) {
		Parent p = new Child();
		Parent p1 = new Parent();
		p.print();
		p1.print();
		
		Child c = (Child)p;
		c.print();
	}
}
