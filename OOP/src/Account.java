import java.time.LocalDate;

public class Account extends Person
{
	protected String username;
	protected String password;
	protected String email;
	protected String mobile;
	protected LocalDate dateCreated;
	protected static int numOfAccounts = 0;

	public Account()
	{
		numOfAccounts += 1;
		dateCreated = LocalDate.now();
	}

	public Account(String name, LocalDate birthDate, String username, String password, String email, String mobile)
	{
		super(name, birthDate);
		try
		{
			setUsername(username);
			setPassword(password);
		} catch (Exception e)
		{
			System.out.println(e);
			
		}
		dateCreated = LocalDate.now();
		this.email = email;
		this.mobile = mobile;
	}
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) throws Exception
	{
		boolean checkEmail = email
				.matches("^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		if (!checkEmail)
		{
			throw new Exception("Email is not valid");
		} else
			this.email = email;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile) throws Exception
	{
		boolean checkMobile = mobile.matches("05[\\d]{8}");
		if (!checkMobile)
		{
			throw new Exception("Mobile number is not valid");
		} else
			this.mobile = mobile;
	}
	
	public static int numOfAccounts()
	{
		return numOfAccounts;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username) throws Exception
	{
		boolean checkUserName = username.matches("[a-zA-Z0-9]{6,15}");
		if (!checkUserName)
		{
			throw new Exception("username must only contains alphanumeric characters for minimum 6 digits");
		} else
			this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password) throws Exception
	{
		boolean checkPassword = password.matches("[a-zA-Z0-9]{8,}");
		if (!checkPassword)
		{
			throw new Exception("password must only contains alphanumeric characters for minimum 6 digits");
		} else
			this.password = password;
	}

	public LocalDate getDateCreated()
	{
		return dateCreated;
	}

	public boolean login(String username, String password)
	{

		return (this.username.equals(username) && this.password.equals(password));

	}

	@Override
	public String toString()
	{
		return "Account [username=" + username + ", password=" + password + ", email=" + email + ", mobile=" + mobile
				+ ", dateCreated=" + dateCreated + "]";
	}

}