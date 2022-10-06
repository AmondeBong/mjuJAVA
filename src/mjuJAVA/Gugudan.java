package mjuJAVA;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[]args) {
		System.out.println("2부터 12까지 입력하시오");
        System.out.print("몇단을 출력할까요 ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        
        int[][]cal = new int[11][9];
        
        for(int r=0;r<11;r++){ 
                for(int c=0;c<9;c++) {
                	cal[r][c] = (r+2)*(c+1);
                	
                	}
                
                }       

        if(num<2 || num>12){
                System.out.println("2에서 12까지만 입력하시오");
        } else{
                for(int i=0;i<9;i++){
                        System.out.printf("%d*%d = %d\n",num,(i+1),cal[num-2][i]);
                }
        	}
	}
	
}
