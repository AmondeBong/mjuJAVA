package mjuJAVA;

public class DiceTest {
	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int count = 0;
		int result =0;
		
		while(result != 2) {
			d1.roll();
			d2.roll();
			result = d1.getValue()+d2.getValue();
			count++;
		}
		if(result == 2) {
			System.out.println("("+d1.getValue()+","+d2.getValue()+")이 나오는데 걸린 횟수 = "+count);
		}
		
	}
}
