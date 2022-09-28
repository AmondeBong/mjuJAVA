package mjuJAVA;

public class Diamond2 {
	public static void main(String[]args) {
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
		
	}
}
