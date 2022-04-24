public class Action
{
	protected Person person;
	protected Movie movie;
	protected Action[] actionsArr;
	protected final int MAX_ARR = 500;
	
	public Action()
	{
		actionsArr = new Action[MAX_ARR];
	}
	public Action(Movie movie, Person person)
	{
		this.movie = movie;
		this.person = person;
		actionsArr = new Action[MAX_ARR];
	}
	public Person getPerson()
	{
		return person;
	}
	public void setPerson(Person person)
	{
		this.person = person;
	}
	public Movie getMovie()
	{
		return movie;
	}
	public void setMovie(Movie movie)
	{
		this.movie = movie;
	}
	
	// method that displays all movies that the passed person has a relation with
	// example: all movies that user1 reviewed
	public void displayAllMovies(Person person)
	{
		boolean found = false;
		for (int i = 0; i < MAX_ARR; i++)
		{
			if (actionsArr[i].getPerson() == person)
			{
				found = true;
				System.out.println(actionsArr[i].getMovie().getName());
			}
		}
		if (found == false)
			System.out.println(person + " Not found."); // make try catch
	}
	
	// method that displays all persons that the passed movie has a relation with
	// example: all reviewers of movie1
	public void displayAllPersons(Movie movie)
	{
		boolean found = false;
		for (int i = 0; i < MAX_ARR; i++)
		{
			if (actionsArr[i].getMovie() == movie)
			{
				found = true;
				System.out.println(actionsArr[i].getPerson().getName());
			}
		}
		if (found == false)
			System.out.println(movie + " Not found."); // make try catch
	}
	
	@Override
	public String toString()
	{
		return "Action [person=" + person + ", movie=" + movie + "]";
	}
}
