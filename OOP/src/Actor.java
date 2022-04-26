import java.time.LocalDate;
import java.util.ArrayList;

public class Actor extends MovieEcosystem
{
	private ArrayList<Acts> moviesArrList = new ArrayList<Acts>();
	private static int numOfActors = 0;

	public Actor()
	{
		super();
		numOfActors += 1;
	}

	public Actor(String name, LocalDate birthDate, String b, String i)
	{
		super(name, birthDate, b, i);
		numOfActors += 1;
	}

	public int getNumOfActors()
	{
		return numOfActors;
	}
	public void addMovie(Movie movie, String role, String characterName)
	{
		moviesArrList.add(new Acts(movie, this, role, characterName)); //acts
	}
	
	public ArrayList<Acts> getMoviesArrList()
	{
		return moviesArrList;
	}

	@Override
	public String toString()
	{
		return "Actor [name=" + name + ", birthDate=" + birthDate + "]";
	}
}