import java.time.LocalDate;

public class Reviews extends Action
{
	private String comment;
	private double rating;
	private LocalDate reviewDate;
	
	public Reviews(User user, Movie movie, String comment, double rating)
	{
		super(movie, user);
		this.comment = comment;
		this.rating = rating;
		reviewDate = LocalDate.now();
	}

	public String getComment() 
	{
		return comment;
	}

	public void setComment(String comment) 
	{
		this.comment = comment;
	}

	public double getRating() 
	{
		return rating;
	}

	public void setRating(double rating) 
	{
		this.rating = rating;
	}

	public LocalDate getReviewDate() 
	{
		return reviewDate;
	}

	public double ratingAvg()
	{
		double result = 0;
		int count = 0;
		for (int i = 0; i < MAX_ARR; i++)
			if (actionsArr[i] instanceof Reviews)
			{
				result = result + ((Reviews) actionsArr[i]).getRating();
				count += 1;
			}
				
		return result/count;
	}
	
	@Override
	public String toString() {
		return "Reviews [user=" + person.getName() + ", movie=" + movie.getName() + ", comment=" + comment + ", rating=" + rating + ", reviewDate=" + reviewDate
				+ "]";
	}
}
