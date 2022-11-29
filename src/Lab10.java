
import java.util.Random;
import java.util.ArrayList;

/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 10
 * @data 20221129
 */


public class Lab10 {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		for(int i=0;i<5;i++) {
			list1.add(Integer.valueOf(random.nextInt(100)));
		}
		
		list1.add(2,Integer.valueOf(random.nextInt(100)));
		
		int sum = 0;
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++){
			sum += list1.get(i);
			}
		System.out.println("합: "+sum);
		}
	

	
}
