package bicycle;

/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 7
 * @data 20221103
 */


public class MountainBike extends Bicycle {
	private int seatHeight;
	
	public MountainBike(int startSpeed,int startGear,int startHeight) {
		super(startSpeed,startGear);
		this.seatHeight = startHeight;
	}
	
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	@Override
	public int plusSpeed(int percent) {
		return speed += speed*percent/100;
	}
	@Override
	public int subSpeed(int percent) {
		return speed = speed - (speed*percent/100);
	}
	
	public int getSeatHeight() {
		return seatHeight;
	}
	
	public String toString() {
		return "속도 : "+getSpeed()+", 기어: "+getGear()+", 의자 높이: "+getSeatHeight();
	}
	
}




