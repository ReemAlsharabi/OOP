import java.time.LocalDate;
import java.util.ArrayList;

public class Producer extends MovieEcosystem
{

	private static int numOfProducers = 0;

	public Producer()
	{
		super();
		numOfProducers += 1;
	}

	public Producer(String name, LocalDate bDate, String bPlace, String info)
	{
		super(name, bDate, bPlace, info);
		numOfProducers += 1;
	}
<<<<<<< HEAD
	
	public static int getNumOfProducers()
=======

	public int getNumOfProducers()
>>>>>>> branch 'master' of https://github.com/ReemCodes/OOP.git
	{
		return numOfProducers;
	}

	@Override
	public String toString()
	{
		return "Producer [name=" + name + ", birthDate=" + birthDate + "]";
	}
<<<<<<< HEAD
	
	
}
=======

}
>>>>>>> branch 'master' of https://github.com/ReemCodes/OOP.git
