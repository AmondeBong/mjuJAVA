package mjuJAVA;
import java.util.Scanner;

/** *A short description of the program.
 * 
 * @author MinsuO
 * @assignment JAVAproject
 * @data 22.09.20
 **/

public class calcurator {
public static void main(String[] args) {
		
		
		int add,sub,mul,div,x,y; //
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하시오.");
		
		/**
			String n = sc.next() 한 단어 만 받기
			int age = sc.nextInt() 정수로 변환하여 받기
			double d = sc.nextDouble() double 형으로 받기
			String s = sc.nextline() 문자열 전체를 받기
		**/
		
		x = sc.nextInt(); // 이미 있는 method 불러오기
		y = sc.nextInt();
		
		add = add(x,y);
		sub = sub(x,y);
		mul = mul(x,y);
		div = div(x,y);
		
		System.out.println("x: "+x+" y: "+y);
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
