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
	public static String getRole(Movie movie, Actor actor)
	{
		String result = "Not found";
		if (actionsArrList.size() == 0) // if the array is empty
			result = "No Movies Available";
		else
		{
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Produces)
					if (actionsArrList.get(i).getMovie() == movie)
						if (actionsArrList.get(i).getPerson() == actor)
							result = ((Produces) actionsArrList.get(i)).getRole();
			}
		}
		return result;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	public static void setRole(Movie movie, Actor actor, String role)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Produces)
					if (actionsArrList.get(i).getMovie() == movie)
						if (actionsArrList.get(i).getPerson() == actor)
						{
							found = true;
							((Produces) actionsArrList.get(i)).setRole(role);
						}
			}
			if (found == false)
				System.out.println("Movie or Actor not found.");
		}
	}	

	@Override
	public String toString()
	{
		return "Produces [producer=" + person.getName() + ", movie=" + movie.getName() + ", role=" + role + "]";
	}
}