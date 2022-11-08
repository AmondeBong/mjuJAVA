package bicycle;

/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 7
 * @data 20221108
 */

public class Cycle extends Bicycle{
	private boolean isbasket;
	
	public Cycle(int speed,int gear,boolean isbasket) {
		super(speed,gear);
		this.isbasket = isbasket;
	}
	
	@Override
	public int plusSpeed(int percent) {
		return speed += 10+(speed*percent/100);
	}
	@Override
	public int subSpeed(int percent) {
		return speed = speed - (10+(speed*percent/100));
	}
	public boolean getIsbasket() {
		return this.isbasket;
	}
	public String toString() {
		return "속도 : "+getSpeed()+", 기어: "+getGear()+", 바스켓 유무: "+getIsbasket();
	}
}
