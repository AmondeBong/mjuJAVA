package mjuJAVA;

import java.util.Scanner;

public class Diamond {
	public static void main(String[]args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("홀수만 입력해 주세요");
		int count = sc.nextInt();
		int n = count/2;
		for(int i=-n; i<=n;i++) { //-n -n+1 ... n-1 n 총 홀수번
			int k =0;
			for(int j=0;j<count-Math.abs(i);j++) {
				// Math.abs() 양수로 바꿔주는 함수
				String result = k < Math.abs(i) ? " ": "*";
				System.out.print(result);
				k++;
					
		}
			System.out.println();
		
		}
	}
}
