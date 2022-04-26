import java.time.LocalDate;
import java.util.Scanner;

public class Admin extends Account {
	 
	public Admin(){
		dateCreated = LocalDate.now();
		AccountNumber +=1;
	}
	
	public Admin(String username, String password){
		super(username,password);
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
	
	public void AddUser(User u){
		u = new User();
	}
	
	public void AddMovie(Movie m){
		m = new Movie();
	}
	
	public String ChangeUserName(User user){
		System.out.println("Enter your old username: ");
		Scanner input = new Scanner(System.in);
		String OldUsername = input.nextLine();
		input.close();
		if(OldUsername.equals(user.getUsername())){
			System.out.println("Enter your new username: ");
			String newUsername = input.nextLine();
			try{
				user.setUsername(newUsername);
				return "succusfully changed! new username is set to " + newUsername ;
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		else
			return "Failed";
	}
	
	public String ChangePassword(User user){
		System.out.println("Enter your old password: ");
		Scanner input = new Scanner(System.in);
		String OldPassword = input.nextLine();
		input.close();
		if(OldPassword.equals(user.getPassword())){
			System.out.println("Enter your new password: ");
			String newPassword = input.nextLine();
			try{
				user.setPassword(newPassword);
				return "succusfully changed! new password is set to " + newPassword ;
			}
			catch(Exception e){
				System.out.println(e);
			}
			
		}
		else
				return "Failed" ;	
	}
	
	public void DeleteUser(User user){
		user =null;
		System.gc();
	}
	
	public void DeleteMovie(Movie m){
		m =null;
		System.gc();
	}

  
}
