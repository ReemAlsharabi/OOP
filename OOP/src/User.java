import java.time.LocalDate;
import java.util.*;

public class User extends Account {
	//data fields 
    private ArrayList <Reviews> review = new ArrayList<Reviews>();
    
    
    //constructors
    public User(){
    	dateCreated = LocalDate.now();
    	AccountNumber += 1;
    }
    
    public User(String username, String password){
    	super(username,password);
    }
    
    
	public ArrayList<Reviews> getReview() {
		return review;
	}


	public void addReviews(User user, Movie movie, String comment, double ratingValue)
	{
		review.add(new Reviews(movie, user, comment, ratingValue));
	}
	 
	public String toString()
	{
		return super.getUsername() + "reviewing history: " + review;
	}

}
