/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 9
 * @data 20221122
 */

public class Lab9 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		double c = 3.1415;
		double d = 4.5;
		
		
		/**
		 Integer.valueOf(String) : Integer 클래스 반환
		Integer.parseInt(String) : int형 반환
		**/
		
		Integer i = Integer.valueOf(a);
		Integer j = Integer.valueOf(b);
		
		Double k = Double.valueOf(c);
		Double g = Double.valueOf(d);
		
		if(i.compareTo(j) == 0) {
			System.out.println("둘은 같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		if(k.compareTo(g) ==  0) {
			System.out.println("둘은 같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
		
		
	
		
		
	}

}
