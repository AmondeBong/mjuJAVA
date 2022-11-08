package bicycle;
/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 7
 * @data 20221108
 */

public class ElectricalBike extends Bicycle{
	private int battery;
	public ElectricalBike(int speed,int gear,int battery) {
		super(speed,gear);
		this.battery = battery;
	}
	
	public void setBattery(int min) {
		this.battery = 5*min;
	}
	
	public int getBattery() {
		return this.battery;
	}
	
	@Override
	public int plusSpeed(int percent) {
		return speed += battery*percent/100;
	}
	
	@Override
	public int subSpeed(int percent) {
		return speed = speed - (battery*percent/100);
	}
	
	public String toString() {
		return "속도 : "+getSpeed()+", 기어: "+getGear()+", 배터리: "+getBattery();
	}
	
}
