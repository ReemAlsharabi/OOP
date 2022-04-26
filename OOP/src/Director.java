import java.time.LocalDate;

public class Director extends MovieEcosystem
{

	private static int numOfDirectors;

	public Director()
	{
		super();
		numOfDirectors += 1;
	}

	public Director(String name, String email, String mobile, LocalDate bDate, String bPlace, String info)
	{
		super(name, email, mobile, bDate, bPlace, info);
		numOfDirectors += 1;
	}

	public int getNumOfDirectors()
	{
		return numOfDirectors;
	}

	@Override
	public String toString()
	{
		return super.toString() + "Jop: Director";
	}
}