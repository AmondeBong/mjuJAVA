package lab8;


/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 8
 * @data 20221115
 */





interface Movable{
	void move(int dx, int dy);
}

interface Area{
	void getArea();
}

class Shape implements Movable,Area{
	private int x,y;
	public double area;
	
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void getArea() {
		
	}
	
	public void move(int dx,int dy) {
		x += dx;
		y += dy;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
}

class Circle extends Shape{
	private int r;
	
	public Circle() {
		super(0,0);
	}
	
	@Override
	public void getArea(){
		this.area = 3.141592*r*r;
		System.out.println("Circle의 면적: "+this.area);
	}
	public Circle(int x, int y,int r) {
		super(x,y);
		this.r = r;
	}
	
	
}


class Rectangle extends Shape{
	private int width,height;
	public Rectangle() {
		super(0,0);
	}
	
	public void getArea() {
		this.area = width*height;
		System.out.println("Rectangle의 면적: "+this.area);
	}
	
	public Rectangle(int x, int y,int width,int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
}


class Triangle extends Shape{
	private int base,height;
	
	public void getArea() {
		this.area = base*height*1/2;
		System.out.println("Triangle의 면적: "+this.area);
	}
	
	public Triangle() {
		super(0,0);
	}
	public Triangle(int x, int y,int base,int height) {
		super(x,y);
		this.base = base;
		this.height = height;
	}
	
}
public class lab8 {
	public static void main(String[] args) {
		Shape [] arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Circle(10,10,20);
		arrayOfShapes[1] = new Rectangle(5,5,10,20);
		arrayOfShapes[2] = new Triangle(15,15,10,20);
		
		for(int j=0;j<arrayOfShapes.length;j++) {
			System.out.println("x좌표: "+arrayOfShapes[j].getX()+" y좌표: "+arrayOfShapes[j].getY());
		}
		
		System.out.println();
		
		for(int i=0;i<arrayOfShapes.length;i++) {
			arrayOfShapes[i].move(10,10);
			arrayOfShapes[i].getArea();
		}
		
		System.out.println();
		
		for(int j=0;j<arrayOfShapes.length;j++) {
			System.out.println("x좌표: "+arrayOfShapes[j].getX()+" y좌표: "+arrayOfShapes[j].getY());
		}
		
		
	}
}









