package mjuJAVA;
/** A short description of the program
 * @SID : 60205210
 * @author O minsu
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
		System.out.println(bi[0]);
		System.out.println(bi[1]);
		System.out.println(bi[2]);
		
		System.out.println();
		
		bi[0].plusSpeed(10);
		bi[1].plusSpeed(10);
		bi[2].plusSpeed(10);
		System.out.println("각각 percent가 10일때 추가:");
		System.out.println(bi[0]);
		System.out.println(bi[1]);
		System.out.println(bi[2]);
		
		
		bi[0].subSpeed(3);
		bi[1].subSpeed(3);
		bi[2].subSpeed(3);
		System.out.println("각각 percent가 3일때 감소:");
		System.out.println(bi[0]);
		System.out.println(bi[1]);
		System.out.println(bi[2]);
		
		
		
	}
}
