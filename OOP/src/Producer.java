import java.time.LocalDate;
import java.util.ArrayList;

public class Producer extends MovieEcosystem
{
	private ArrayList<Movie> movies;

	public Producer(String name, String email, String mobile, LocalDate bDate, String bPlace, String info)
	{
		super(name, email, mobile, bDate, bPlace, info);
		movies = new ArrayList<Movie>();
	}

	public ArrayList<Movie> getMovies()
	{
		return movies;
	}

	public void addMovie(Movie movie)
	{
		movies.add(movie);
	}

	@Override
	public String toString()
	{
		return super.toString() + "Producer [movies=" + movies + "]";
	}

}
