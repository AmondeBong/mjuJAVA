package bicycle;

/** A short description of the program
 * @SID : 60205210
 * @author MinsuO
 * @assignment JAVA Programming - 7
 * @data 20221103
 */

public class Bicycle{
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