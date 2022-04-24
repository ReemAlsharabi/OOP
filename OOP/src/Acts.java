class Acts extends Action
{
	private String role;
	private String characterName;
	
	public Acts(Movie movie, Actor actor, String role, String characterName)
	{
		super(movie, actor);
		this.role = role;
		this.characterName = characterName;
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
			if (actionsArr[i] instanceof Acts)
				if (actionsArr[i].getMovie() == movie);
				{
					found = true;
					result = ((Acts) actionsArr[i]).getRole();
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
			if (actionsArr[i] instanceof Acts)
				if (actionsArr[i].getMovie() == movie);
				{
					found = true;
					((Acts) actionsArr[i]).setRole(role);
				}
		}
		if (found == false)
			System.out.println("Movie not found.");
	}
	public String getCharacterName()
	{
		return characterName;
	}
	
	public String getCharacterName(Movie movie)
	{
		boolean found = false;
		String result = "Not found";
		for (int i = 0; i < MAX_ARR; i++)
		{
			if (actionsArr[i] instanceof Acts)
				if (actionsArr[i].getMovie() == movie);
				{
					found = true;
					result = ((Acts) actionsArr[i]).getCharacterName();
				}
		}
		return result;
	}
	
	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}
	public void setCharacterName(Movie movie, String characterName)
	{
		boolean found = false;
		for (int i = 0; i < MAX_ARR; i++)
		{
			if (actionsArr[i] instanceof Acts)
				if (actionsArr[i].getMovie() == movie);
				{
					found = true;
					((Acts) actionsArr[i]).setCharacterName(role);
				}
		}
		if (found == false)
			System.out.println("Movie not found.");
	}
	@Override
	public String toString()
	{
		return "Acts [actor=" + person.getName() + ", movie=" + movie.getName() + ", role=" + role + ", characterName=" + characterName + "]";
	}
}