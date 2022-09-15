package mjuJAVA;
import java.util.Scanner;

public class calcurator {
public static void main(String[] args) {
		
		
		int add,sub,mul,div,x,y; //
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		add = add(x,y);
		sub = sub(x,y);
		mul = mul(x,y);
		div = div(x,y);
		
		System.out.println("임의의 수 x: "+x+" y: "+y);
		System.out.println("x y 더하기 : "+add);
		System.out.println("x y 빼기 : "+sub);
		System.out.println("x y 곱하기 : "+mul);
		System.out.println("x y 나머지 : "+div);
		
		
	}
	
	public static int add(int x, int y) {
		int sum = x+y;
		return sum;
	}
	public static int sub(int x,int y) {
		int sum = x-y;
		return sum;
	}
	public static int mul(int x,int y) {
		int sum = x*y;
		return sum;
	}
	public static int div(int x,int y) {
		int sum = x%y;
		return sum;
	}
}
