import java.time.LocalDate;

public class Writer extends MovieEcosystem{
	
	public Writer() 
	{
		super();
	}
	
	public Writer(String name, String email, String mobile, LocalDate bDate, String bPlace, String info) 
	{
		super(name, email, mobile, bDate, bPlace, info);
	}

	@Override
	public String toString() {
		return super.toString() + "Jop: Writer";
	}
	
}
