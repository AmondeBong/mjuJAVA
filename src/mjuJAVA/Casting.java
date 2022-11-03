package mjuJAVA;

class Parent{
	public Parent() {
		System.out.println("make Parent class");
	}
	void print() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println("make Child class");
	}
	@Override
	void print() {
		System.out.println("Child");
	}
}
public class Casting {
	public static void main(String[] args) {
		Parent p = new Child(); 
		p.print();
		System.out.println();
		
		Parent p1 = new Parent();
		p1.print();
		System.out.println();
		
		Child c = (Child)p;
		c.print();
		System.out.println();
	}
}
