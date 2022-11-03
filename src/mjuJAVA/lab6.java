package mjuJAVA;
/** A short description of the program
 * @SID : 60205210
 * @author O minsu
 * @assignment JAVA Programming - 6
 * @data 20221030
 */
public class lab6 {
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(10,2,10);
		
		for(int i=0;i<3;i++) {
			mb.plusSpeed(5);
		}
		
		for(int j=0;j<5;j++) {
			mb.plusGear(1);
		}
		
		System.out.println(mb.toString());
	}
}
