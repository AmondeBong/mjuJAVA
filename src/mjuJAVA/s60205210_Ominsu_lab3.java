package mjuJAVA;
import java.util.Scanner;
/** *A short description of the program.
 * 
 * @author OMinsu
 * @SID 60205210
 * @assignment JAVAproject
 * @data 22.09.27
 **/
public class s60205210_Ominsu_lab3 {
	
		
		public static void main(String[]args){
			
			final int k =10;
				int n=1;
				for(int i=0; i<k/2; i++){ 
					// 위쪽 반띵 다이아
					for (int p=0; p<(k/2)-n; p++) {System.out.print("*"); } 
					for (int q=0; q<n; q++) {System.out.print(" ");}
					for (int e=0; e<n; e++) {System.out.print(" ");}
					for (int r=0; r<(k/2)-n; r++) {System.out.print("*"); }
					n++;
					System.out.println(); //줄바꿈
				}

				/**
				 4114
				 3223
				 2332
				 1441
				 0550
				**/


				n =1;
				for(int j=0; j< k/2; j++){
				//아래쪽 반띵 다이아
				for (int p=0; p<n; p++) {System.out.print("*"); } 
				for (int q=0; q<(k/2)-n; q++) {System.out.print(" ");}
				for (int e=0; e<(k/2)-n; e++) {System.out.print(" ");}
				for (int r=0; r<n; r++) {System.out.print("*"); }
				n++;
				System.out.println(); //줄바꿈
				  
				}
				
				
				/**
				 1441
				 2332
				 3223
				 4114
				 5005
				**/
			
			System.out.println("2부터 12까지 입력하시오");
			System.out.print("몇단을 출력할까요 ");
			Scanner sc = new Scanner(System.in);
			int num =sc.nextInt();	
			int []cal = new int[9];
			for(int i=0;i<9;i++){
				cal[i] = num * (i+1);
				System.out.printf("%d*%d = %d\n",num,(i+1),cal[i]);
			
				}


        }


        
	}

