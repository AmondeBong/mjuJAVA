package mjuJAVA;
import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] Array3 = new int[5];
		int[][] Array_2 = new int[3][];
		
		Array_2[0] = new int[1];
		Array_2[1] = new int[2];
		Array_2[2] = new int[3];
		
		for(int i=0;i<Array_2.length;i++) {
			for(int j=0;j<Array_2[i].length;j++) {
				Array_2[i][j] = 2*j;
				System.out.println("");
			}
		}
		
		}
}
