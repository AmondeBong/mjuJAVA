package mjuJAVA;

public class Dice {
	private int value;
	public Dice() {
		value = 0;
	}
	public int roll() {
		value =(int)(Math.random() * 5 )+ 1;
		return value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int val) {
		this.value = val;
	}
	
}
