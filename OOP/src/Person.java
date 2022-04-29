import java.util.*;
import java.time.LocalDate;

public abstract class Person
{
	// data fields
	protected String name;
	protected LocalDate birthDate;

	// constructors
	public Person()
	{
		this("", null);
	}

	public Person(String name, LocalDate birthDate)
	{
		this.name = name;
		this.birthDate = birthDate;
	}

	// Getters and Setters
	public String getName()
	{
		return name;
	}

	public void setName(String name) throws Exception
	{
		boolean checkName = name.matches("[a-zA-Z]{2,}"); // only letters, will accept a name with at least 2 letters
		if (checkName == false)
		{
			throw new Exception("Name is not valid");
		} else
		{
			this.name = name;
		}
	}

	public LocalDate getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) throws Exception
	{
		boolean checkDate = (birthDate.toString()).matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");// DD/MM/YYYY
		if (!checkDate)
		{
			throw new Exception("Date is not valid");
			
		} else
			this.birthDate = birthDate;

	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", birthDate=" + birthDate + "]";
	}
}
