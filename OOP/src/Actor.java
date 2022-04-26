import java.time.LocalDate;

public class Actor extends MovieEcosystem{
	
	public Actor() 
	{
		super();
	}
	
	public Actor(String name, String email, String mobile, LocalDate birthDate, String b, String i) 
	{
		super(name, email, mobile, birthDate, b, i);
	}


	@Override
	public String toString() 
	{
		return super.toString() + "Job: Actor";
	}
}
