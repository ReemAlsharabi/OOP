import java.time.LocalDate;

public class Actor extends MovieEcosystem{
	
	private static int numOfActors;
	
	public Actor() 
	{
		super();
		numOfActors += 1;
	}
	
	public Actor(String name, String email, String mobile, LocalDate birthDate, String b, String i) 
	{
		super(name, email, mobile, birthDate, b, i);
		numOfActors += 1;
	}
	
	public int getNumOfActors()
	{
		return numOfActors;
	}


	@Override
	public String toString() 
	{
		return super.toString() + "Job: Actor";
	}
}