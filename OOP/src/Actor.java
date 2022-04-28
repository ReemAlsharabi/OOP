import java.time.LocalDate;
import java.util.ArrayList;

public class Actor extends MovieEcosystem
{
	private static int numOfActors = 0;

	public Actor()
	{
		super();
		numOfActors += 1;
	}
<<<<<<< HEAD
	
	
	public Actor(String name, String email, String mobile, LocalDate birthDate, String b, String i) 
=======

	public Actor(String name, LocalDate birthDate, String b, String i)
>>>>>>> branch 'master' of https://github.com/ReemCodes/OOP.git
	{
		super(name, birthDate, b, i);
		numOfActors += 1;
	}
<<<<<<< HEAD
	
	public static int getNumOfActors()
=======

	public int getNumOfActors()
>>>>>>> branch 'master' of https://github.com/ReemCodes/OOP.git
	{
		return numOfActors;
	}
	

	@Override
	public String toString()
	{
		return "Actor [name=" + name + ", birthDate=" + birthDate + "]";
	}
}