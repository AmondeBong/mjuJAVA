package mjuJAVA;

public class Movie {
	public String title,director;
	public static int count;
	public Movie(String title,String director) {
		count++;
		this.title = title;
		this.director = director;
	}
}
