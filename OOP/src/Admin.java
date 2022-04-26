import java.time.LocalDate;
import java.util.Scanner;

public class Admin extends Account
{

	public Admin()
	{
		super();
		dateCreated = LocalDate.now();
	}

	public Admin(String username, String password, String email, String mobile)
	{
		super(username, password, email, mobile);
	}

	public void ShowAdminMenu()
	{
		System.out.println("1) Create user");
		System.out.println("2) Create Movie");
		System.out.println("3) Delete user");
		System.out.println("4) Delete Movie");
		System.out.println("5) change username ");
		System.out.println("6) change password ");
	}

	public void AddUser(User u)
	{
		u = new User();
	}

	public void AddMovie(Movie m)
	{
		m = new Movie();
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

	public Movie DeleteMovie()
	{
		return null;
	}

	@Override
	public String toString()
	{
		return "Admin [username=" + username + ", password=" + password + ", dateCreated=" + dateCreated + ", name="
				+ name + ", email=" + email + ", mobile=" + mobile + ", birthDate=" + birthDate + "]";
	}
}
