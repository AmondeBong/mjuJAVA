import bicycle.*;

/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 7
 * @data 20221103
 */
public class lab7 {
	public static void main(String[] args) {
		Bicycle[] bi = new Bicycle[3];
		bi[0] = new Cycle(10,5,true);
		bi[1] = new MountainBike(10,30,5);
		bi[2] = new ElectricalBike(10,20,50);
		System.out.println("초기 설정");
		
		for(int i=0;i<bi.length;i++) {
			System.out.println(bi[i]);	
		}
		System.out.println();
		
		for(int i=0;i<bi.length;i++) {
			bi[i].plusSpeed(10);
		}
		
		
		System.out.println("각각 percent가 10일때 추가:");
		for(int i=0;i<bi.length;i++) {
			System.out.println(bi[i]);	
		}
		
		
		for(int i=0;i<3;i++) {
			bi[i].subSpeed(10);
		}
		
		System.out.println("각각 percent가 3일때 감소:");
		for(int i=0;i<3;i++) {
			System.out.println(bi[i]);	
		}
		
		
		
	}
}
