import java.time.LocalDate;

public class Director extends MovieEcosystem
{

	private static int numOfDirectors = 0;

	public Director()
	{
		super();
		numOfDirectors += 1;
	}

	public Director(String name, String email, String mobile, LocalDate bDate, String bPlace, String info)
	{
		super(name, bDate, bPlace, info);
		numOfDirectors += 1;
	}
<<<<<<< HEAD
	
	public static int getNumOfDirectors()
=======

	public int getNumOfDirectors()
>>>>>>> branch 'master' of https://github.com/ReemCodes/OOP.git
	{
		return numOfDirectors;
		
	}

	@Override
	public String toString()
	{
		return "Director [name=" + name + ", birthDate=" + birthDate + "]";
	}
}