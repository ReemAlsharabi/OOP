public class Produces extends Action
{
	private String role;
	
	public Produces(Movie movie, Producer producer, String role)
	{
		super(movie, producer);
		this.role = role;
	}
	public String getRole()
	{
		return role;
	}
	public String getRole(Movie movie)
	{
		boolean found = false;
		String result = "Not found";
		for (int i = 0; i < MAX_ARR; i++)
		{
			if (actionsArr[i] instanceof Produces)
				if (actionsArr[i].getMovie() == movie);
				{
					found = true;
					result = ((Produces) actionsArr[i]).getRole();
				}
		}
		return result;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	public void setRole(Movie movie, String role)
	{
		boolean found = false;
		for (int i = 0; i < MAX_ARR; i++)
		{
			if (actionsArr[i] instanceof Produces)
				if (actionsArr[i].getMovie() == movie);
				{
					found = true;
					((Produces) actionsArr[i]).setRole(role);
				}
		}
		if (found == false)
			System.out.println("Movie not found.");
	}
	@Override
	public String toString()
	{
		return "Produces [movie=" + movie.getName() + ", producer=" + person.getName() + "]";
	}
}
