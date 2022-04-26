import java.time.LocalDate;
import java.util.*;

public class User extends Account
{
	// data fields
	private ArrayList<Reviews> review = new ArrayList<Reviews>();

	// constructors
	public User()
	{
		super();
	}

	public User(String username, String password, String email, String mobile)
	{
		super(username, password, email ,mobile);
	}

	public ArrayList<Reviews> getReview()
	{
		return review;
	}


	public void addReviews(User user, Movie movie, String comment, double ratingValue)
	{
		review.add(new Reviews(movie, user, comment, ratingValue));
	}

	@Override
	public String toString()
	{
		return "User [review=" + review + "]";
	}

}
