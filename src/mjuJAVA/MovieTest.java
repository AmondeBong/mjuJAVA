package mjuJAVA;
import java.util.Scanner;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie[] list =  new Movie[2];
		list[0] = new Movie("백투더퓨쳐","로버트 저메키스");
		list[1] = new Movie("티파니에서 아침을","에드워드 블레이크");
		
		for(int i=0;i<Movie.count;i++) {
			System.out.println("==================");
			System.out.println("영화 제목 "+list[i].title);
			System.out.println("영화 감독 "+list[i].director);
			System.out.println("==================");
		}
		
		
		
	}
	
	
}
