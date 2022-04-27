import java.time.LocalDate;
import java.util.*;

public class User extends Account
{
	// data fields
	

	// constructors
	public User()
	{
		super();
	}

	public User(String name, LocalDate birthDate, String username, String password, String email, String mobile)
	{
		super(name, birthDate, username, password, email ,mobile);
	}

	

	@Override
	public String toString()
	{
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", dateCreated=" + dateCreated + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
