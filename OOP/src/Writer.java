import java.time.LocalDate;

public class Writer extends MovieEcosystem{
	
	private static int numOfWriters;
	
	public Writer() 
	{
		super();
		numOfWriters += 1;
	}
	
	public Writer(String name, String email, String mobile, LocalDate bDate, String bPlace, String info) 
	{
		super(name, email, mobile, bDate, bPlace, info);
		numOfWriters += 1;
	}
	
	public int getNumOfWriters()
	{
		return numOfWriters;
	}

	@Override
	public String toString() {
		return super.toString() + "Jop: Writer";
	}
	
}
