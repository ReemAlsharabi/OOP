import java.time.LocalDate;
import java.util.ArrayList;

public class Producer extends MovieEcosystem{
	
	public Producer() 
	{
		super();
	}
	
	public Producer(String name, String email, String mobile, LocalDate bDate, String bPlace, String info) 
	{
		super(name, email, mobile, bDate, bPlace, info);
	}

	@Override
	public String toString() 
	{
		return super.toString() + "Job: Producer";
	}
	
}
