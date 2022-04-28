import java.time.LocalDate;

public class Reviews extends Action
{
	private String comment;
	private double rating;
	private LocalDate reviewDate;
	private static int numOfReviews = 0;
	
	public Reviews()
	{
		numOfReviews+=1;
	}
	public Reviews(Movie movie, User user, String comment, double rating)
	{
		super(movie, user);
		this.comment = comment;
		this.rating = rating;
		reviewDate = LocalDate.now();
		numOfReviews+=1;
	}

	public String getComment() 
	{
		return comment;
	}

	public void setComment(String comment) 
	{
		this.comment = comment;
	}
	public static void setComment(String comment, Movie movie, User user)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Reviews Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Reviews)
					if (actionsArrList.get(i).getMovie() == movie)
						if (actionsArrList.get(i).getPerson() == user)
						{
							found = true;
							((Reviews) actionsArrList.get(i)).setComment(comment);
							((Reviews) actionsArrList.get(i)).setReviewDate(LocalDate.now());
						}
			}
			if (found == false)
				System.out.println("Review not found.");
		}
	}
	public double getRating() 
	{
		return rating;
	}

	public void setRating(double rating) 
	{
		this.rating = rating;
	}
	
	public static void setRating(double rating, Movie movie, User user)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Reviews Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Reviews)
					if (actionsArrList.get(i).getMovie() == movie)
						if (actionsArrList.get(i).getPerson() == user)
						{
							found = true;
							((Reviews) actionsArrList.get(i)).setRating(rating);
							((Reviews) actionsArrList.get(i)).setReviewDate(LocalDate.now());
						}
			}
			if (found == false)
				System.out.println("Review not found.");
		}
	}

	public LocalDate getReviewDate() 
	{
		return reviewDate;
	}

	public void setReviewDate(LocalDate reviewDate)
	{
		this.reviewDate = reviewDate;
	}
	public static double getRatingAvg(Movie movie)
	{
		double result = 0;
		int count = 0;

		for (int i = 0; i < actionsArrList.size(); i++)
			if (actionsArrList.get(i) instanceof Reviews)
				if (actionsArrList.get(i).getMovie() == movie)
				{
					result = result + ((Reviews) actionsArrList.get(i)).getRating();
					count += 1;
				}
				
		return result/count;
	}
	
	public static void removeReview(Movie movie, User user)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Reviews)
					if (actionsArrList.get(i).getMovie() == movie)
						if (actionsArrList.get(i).getPerson() == user)
						{
							found = true;
							(actionsArrList.get(i)).removeAction();
						}
			}
			if (found == false)
				System.out.println("Review not found.");
		}
	}
	public static int getNumOfReviews()
	{
		return numOfReviews;
	}
	public static void displayAllComments(Movie movie)
	{

		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Reviews)
					if (actionsArrList.get(i).getMovie() == movie)
					{
						found = true;
						System.out.println(((Reviews) actionsArrList.get(i)).getComment());
					}
			}
			if (found == false)
				System.out.println("Review not found.");
		}
	}
	public static void displayAllComments(User user)
	{

		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Reviews)
					if (actionsArrList.get(i).getPerson() == user)
					{
						found = true;
						System.out.println(((Reviews) actionsArrList.get(i)).getComment());
					}
			}
			if (found == false)
				System.out.println("Review not found.");
		}
	}
	@Override
	public String toString()
	{
		return "Reviews [comment=" + comment + ", rating=" + rating + ", reviewDate=" + reviewDate + ", user="
				+ person + ", movie=" + movie + ", actionsArrList=" + actionsArrList + "]";
	}
}