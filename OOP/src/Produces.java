public class Produces extends Action{
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
	public String getWrittingStyle(Movie movie)
	{
		boolean found = false;
		String result = "Not found";
		for (int i = 0; i < actionsArrList.size(); i++)
		{
			if (actionsArrList.get(i) instanceof Producer)
				if (actionsArrList.get(i).getMovie() == movie);
				{
					found = true;
					result = ((Produces) actionsArrList.get(i)).getRole();
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
		for (int i = 0; i < actionsArrList.size(); i++)
		{
			if (actionsArrList.get(i) instanceof Produces)
				if (actionsArrList.get(i).getMovie() == movie);
				{
					found = true;
					((Produces) actionsArrList.get(i)).setRole(role);
				}
		}
		if (found == false)
			System.out.println("Movie not found.");
	}	

	@Override
	public String toString()
	{
		return "Produces [producer=" + person.getName() + ", movie=" + movie.getName() + ", role=" + role + "]";
	}
}