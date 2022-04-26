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
	public String getWrittingStyle(Movie movie)
	{
		boolean found = false;
		String result = "Not found";
		for (int i = 0; i < actionsArrList.size(); i++)
		{
			if (actionsArrList.get(i) instanceof Writer)
				if (actionsArrList.get(i).getMovie() == movie);
				{
					found = true;
					result = ((Writes) actionsArrList.get(i)).getWrittingStyle();
				}
		}
		return result;
	}
	public void setWrittingStyle(String writtingStyle)
	{
		this.writtingStyle = writtingStyle;
	}
	public void setWrittingStyle(Movie movie, String writtingStyle)
	{
		boolean found = false;
		for (int i = 0; i < actionsArrList.size(); i++)
		{
			if (actionsArrList.get(i) instanceof Writes)
				if (actionsArrList.get(i).getMovie() == movie);
				{
					found = true;
					((Writes) actionsArrList.get(i)).setWrittingStyle(writtingStyle);
				}
		}
		if (found == false)
			System.out.println("Movie not found.");
	}	

	@Override
	public String toString()
	{
		return "Writes [writer=" + person.getName() + ", movie=" + movie.getName() + ", writting style=" + writtingStyle + "]";
	}
}
