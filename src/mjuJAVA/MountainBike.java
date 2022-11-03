package mjuJAVA;
/** A short description of the program
 * @SID : 60205210
 * @author O minsu
 * @assignment JAVA Programming - 7
 * @data 20221103
 */

class Bicycle{
	protected int Gear;
	protected int speed;
	
	public Bicycle(){
		Gear = 0;
		speed = 0;
	}
	
	public Bicycle(int speed, int Gear){
		this.Gear = Gear;
		this.speed = speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setGear(int gear) {
		this.Gear = gear;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getGear() {
		return Gear;
	}
	
	public int plusSpeed(int value) {
		return this.speed += value;
	}
	
	public int subSpeed(int value) {
		return this.speed -= value;
	}
	
	public int plusGear(int value) {
		return this.Gear += value;
	}
	
	public int subGear(int value) {
		return this.Gear -= value;
	}
	
	
}

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

class ElectricalBike extends Bicycle{
	private int battery;
	public ElectricalBike(int speed,int gear,int battery) {
		super.speed = speed;
		super.Gear = gear;
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

class Cycle extends Bicycle{
	private boolean isbasket;
	
	public Cycle(int speed,int gear,boolean isbasket) {
		super.speed = speed;
		super.Gear = gear;
		this.isbasket = isbasket;
	}
	
	@Override
	public int plusSpeed(int percent) {
		return speed += 10+(speed*percent/100);
	}
	
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
