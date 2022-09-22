package mjuJAVA;
import java.util.Scanner;
/** *A short description of the program.
 * 
 * @author OMinsu
 * @SID 60205210
 * @assignment JAVAproject
 * @data 22.09.20
 **/
public class s60205210_Ominsu_lab2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		boolean finish = true ;
		double cel,fah;
		while(finish) {
			System.out.println("==========================");
			System.out.println("1. 화씨 -> 섭씨");
			System.out.println("2. 섭씨 -> 화씨");
			System.out.println("3. 끝내기");
			System.out.println("==========================");
			System.out.print("번호를 선택하시오:");
			num = sc.nextInt();
		
			if(num == 1) {
				System.out.print("화씨 온도를 입력하시오: ");
				fah = sc.nextDouble();
				cel = (fah-32)*5/9;
				System.out.println("섭씨온도는 "+ cel);
			} 	
			else if(num==2){
				System.out.print("섭씨 온도를 입력하시오: ");
				cel = sc.nextDouble();
				fah = (cel*9/5)+32;
				System.out.println("화씨온도는 "+ fah);
			} 
			else if(num==3) {
				System.out.println("온도 변환 프로그램을 종료합니다.");
				finish = false;
			} 
			
			else {
			System.out.println("1 2 3 중에서 선택해 주세요.");
			}
		
	}
	 
	
	}
	
	
}
