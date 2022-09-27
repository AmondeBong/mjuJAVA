package mjuJAVA;

import java.util.ArrayList;

public class ArrayTest2 {
	public static void main(String args[]) {
		//래그드 배열
		int [][]ragged = new int[3][];
		ragged[0] = new int[1];
		ragged[1] = new int[2];
		ragged[2] = new int[3];
		
		for(int r=0;r<ragged.length;r++) {
			for(int c=0;c<ragged[r].length;c++) {
				ragged[r][c] = c;
				System.out.printf("%s", ragged[r][c]);
				}
				System.out.println();
			}
			
		//ArrayList
		
		ArrayList<String> list; //ArratList<String> list = new ArratList<>();
		list = new ArrayList<>();
		//배열의 크기를 동적으로 바꿀수 있다.
		list.add("Apple");
		list.add("Grape");
		System.out.printf("%s\n",list);
		
		for(String obj:list) { //리스트의 원소를 obj로 가리켜서 프린트
			System.out.print(obj+" ");
		}
	}
}
