public class Writes extends Action{
	
	private String writtingStyle;
	
	public Writes(Movie movie, Writer writes, String writtingStyle)
	{
		super(movie, writes);
		this.writtingStyle = writtingStyle;
	}

	public String getWrittingStyle()
	{
		return writtingStyle;
	}
	public static String getWrittingStyle(Movie movie, Actor actor)
	{
		String result = "Not found";
		if (actionsArrList.size() == 0) // if the array is empty
			result = "No Movies Available";
		else
		{
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Writes)
					if (actionsArrList.get(i).getMovie() == movie)
						if (actionsArrList.get(i).getPerson() == actor)
							result = ((Writes) actionsArrList.get(i)).getWrittingStyle();
			}
		}
		return result;
	}
	public void setWrittingStyle(String writtingStyle)
	{
		this.writtingStyle = writtingStyle;
	}
	public static void setWrittingStyle(Movie movie, Actor actor, String writtingStyle)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Writes)
					if (actionsArrList.get(i).getMovie() == movie)
						if (actionsArrList.get(i).getPerson() == actor)
						{
							found = true;
							((Writes) actionsArrList.get(i)).setWrittingStyle(writtingStyle);
						}
			}
			if (found == false)
				System.out.println("Movie or Actor not found.");
		}
	}	

	@Override
	public String toString()
	{
		return "Writes [writer=" + person.getName() + ", movie=" + movie.getName() + ", writting style=" + writtingStyle + "]";
	}
}
