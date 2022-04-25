import java.time.LocalDate;
import java.util.*;

public class User extends Login
{
	// data fields
	private static int AccountNumber = 0;
	private ArrayList<Reviews> review = new ArrayList<Reviews>();

	// constructors
	public User()
	{
		dateCreated = LocalDate.now();
		AccountNumber += 1;
	}

	// Getters and setters

	public int getAccountNumber()
	{
		return AccountNumber;
	}

	public void addReviews(User user, Movie movie, String comment, double ratingValue)
	{
		review.add(new Reviews(user, movie, comment, ratingValue));
	}

	public String toString()
	{
		return super.getUsername() + "reviewing history: " + review;
	}

}