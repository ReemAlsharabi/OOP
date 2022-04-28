import java.time.LocalDate;

public class Writer extends MovieEcosystem{
	
	private static int numOfWriters = 0;
	
	public Writer() 
	{
		super();
		numOfWriters += 1;
	}
	
	public Writer(String name, LocalDate bDate, String bPlace, String info) 
	{
		super(name, bDate, bPlace, info);
		numOfWriters += 1;
	}
	
	
	public static int getNumOfWriters()
	{
		return numOfWriters;
	}

	@Override
	public String toString()
	{
		return "Writer [name=" + name + ", birthDate=" + birthDate + "]";
	}
	
}
