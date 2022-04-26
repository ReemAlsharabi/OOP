import java.time.LocalDate;

public class Account extends Person{
	protected String username;
	protected String  password;
	protected LocalDate dateCreated;
	protected static int AccountNumber = 0;
	
	public Account(){
		AccountNumber += 1;
	}
	
	public Account (String username, String password){
		try{
	    	setUsername(username);
	    	setPassword(password);
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
	}
		
	public static int getAccountNumber() {
		return AccountNumber;
	}


	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) throws Exception {
    	boolean checkUserName = username.matches("[a-zA-Z0-9]{6,15}");
    	if(!checkUserName){
    		throw new Exception("username must only contains alphanumeric characters for minimum 6 digits");}
    	else
    	    this.username = username;
    }
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws Exception{
		boolean checkPassword = password.matches("[a-zA-Z0-9]{8,}");
		if(!checkPassword){
			throw new Exception("password must only contains alphanumeric characters for minimum 6 digits");}
		else
	        this.password = password;
	}
	
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	
	public boolean login(String username, String password){
	   
		return (this.username.equals(username) && this.password.equals(password));
		
	}
	
	public String toString() {
        return super.toString()+"\nusername: "+ username + "\nPassword: " + password ;
  }
}