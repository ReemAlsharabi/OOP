import java.time.LocalDate;

public class Actor extends MovieEcosystem
{

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

	@Override
	public String toString()
	{
		return "Actor [name=" + name + ", birthDate=" + birthDate + "]";
	}
}