package mjuJAVA;
/** A short description of the program
 * @SID : 60205210
 * @author O minsu
 * @assignment JAVA Programming - 6
 * @data 20221101
 */

class Bicycle{
	protected int Gear;
	protected int speed;
	
	public Bicycle(){
		Gear = 0;
		speed = 0;
	}
	
	public Bicycle(int Gear, int speed){
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
	protected int seatHeight;
	
	public MountainBike(int startHeight,int startSpeed,int startGear) {
		super(startGear,startSpeed);
		this.seatHeight = startHeight;
	}
	
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	public int getSeatHeight() {
		return seatHeight;
	}
	
	public String toString() {
		return "속도 : "+getSpeed()+", 기어: "+getGear()+", 의자 높이: "+getSeatHeight();
	}
	
}


