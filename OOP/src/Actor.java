import java.util.ArrayList;
import java.time.LocalDate;

public class Actor extends MovieEcosystem{
	private ArrayList movies;
	
	public Actor(String name, String email, String mobile, LocalDate bDate, String bPlace, String info) {
		super(name, email, mobile, bDate, bPlace, info);
		movies = new ArrayList<Movie>();
	}

	public ArrayList getMovies() {
		return movies;
	}
	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	@Override
	public String toString() {
		return super.toString() + "Actor [movies=" + movies + "]";
	}
}
