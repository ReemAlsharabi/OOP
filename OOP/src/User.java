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

	public void ChangeUserName(User user)
	{
		System.out.println("Enter your old username: ");
		Scanner input = new Scanner(System.in);
		String OldUsername = input.nextLine();
		input.close();
		if (OldUsername.equals(user.getUsername()))
		{
			System.out.println("Enter your new username: ");
			String newUsername = input.nextLine();
			try
			{
				user.setUsername(newUsername);
				System.out.println("succusfully changed! new username is set to " + newUsername);
			} catch (Exception e)
			{
				System.out.println(e);
			}
		} else
			System.out.println("Failed to change");
	}

	public void ChangePassword(User user)
	{
		System.out.println("Enter your old password: ");
		Scanner input = new Scanner(System.in);
		String OldPassword = input.nextLine();
		input.close();
		if (OldPassword.equals(user.getPassword()))
		{
			System.out.println("Enter your new password: ");
			String newPassword = input.nextLine();
			try
			{
				user.setPassword(newPassword);
				System.out.println("succusfully changed! new password is set to " + newPassword);
			} catch (Exception e)
			{
				System.out.println(e);
			}

		} else
			System.out.println("Failed to change");
	}

	public User DeleteUser()
	{
		return null; // user1 = admin.DeleteUser()
	}

	@Override
	public String toString()
	{
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", dateCreated=" + dateCreated + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

}
