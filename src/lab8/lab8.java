package lab8;


/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 8
 * @data 20221110
 */



interface Movable{
	void move(int dx, int dy);
}



class Shape implements Movable{
	private int x,y;
	
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
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
	
	public Rectangle(int x, int y,int width,int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
}
public class lab8 {
	public static void main(String[] args) {
		Shape [] arrayOfShapes = new Shape[2];
		arrayOfShapes[0] = new Circle(10,10,20);
		arrayOfShapes[1] = new Rectangle(5,5,10,20);
		
		for(int i=0;i<2;i++) {
			arrayOfShapes[i].move(10,10);
		}
		
		for(int j=0;j<2;j++) {
			System.out.println("x좌표: "+arrayOfShapes[j].getX()+" y좌표: "+arrayOfShapes[j].getY());
		}
	}
}









