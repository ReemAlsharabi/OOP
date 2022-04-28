import java.time.LocalDate;
import java.util.ArrayList;

public class Producer extends MovieEcosystem{
	
	private static int numOfProducers;
	
	public Producer() 
	{
		super();
		numOfProducers += 1;
	}
	
	public Producer(String name, String email, String mobile, LocalDate bDate, String bPlace, String info) 
	{
		super(name, email, mobile, bDate, bPlace, info);
		numOfProducers += 1;
	}
	
	public static int getNumOfProducers()
	{
		return numOfProducers;
	}

	@Override
	public String toString() 
	{
		return super.toString() + "Job: Producer";
	}
	
	
}
