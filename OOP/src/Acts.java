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
		String result = "Not found";
		if (actionsArrList.size() == 0) // if the array is empty
			result = "No Movies Available";
		else
		{
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Acts)
					if (actionsArrList.get(i).getMovie() == movie)
						result = ((Acts) actionsArrList.get(i)).getRole();
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
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Acts)
					if (actionsArrList.get(i).getMovie() == movie)
					{
						found = true;
						((Acts) actionsArrList.get(i)).setRole(role);
					}
			}
			if (found == false)
				System.out.println("Movie not found.");
		}
	}
	
	public String getCharacterName()
	{
		return characterName;
	}
	
	public String getCharacterName(Movie movie)
	{
		String result = "Not found";
		
		if (actionsArrList.size() == 0) // if the array is empty
			result = "No Movies Available";
		else
		{
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Acts)
					if (actionsArrList.get(i).getMovie() == movie)
						result = ((Acts) actionsArrList.get(i)).getCharacterName();
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
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Acts)
					if (actionsArrList.get(i).getMovie() == movie)
					{
						found = true;
						((Acts) actionsArrList.get(i)).setCharacterName(role);
					}
			}
			if (found == false)
				System.out.println("Movie not found.");
		}
	}
	public void displayCharacter(Movie movie)
	{
		if (actionsArrList.size() == 0) // if the array is empty
			System.out.println("No Movies Available");
		else
		{
			boolean found = false;
			for (int i = 0; i < actionsArrList.size(); i++)
			{
				if (actionsArrList.get(i) instanceof Acts)
					if (actionsArrList.get(i).getMovie() == movie)
					{
						found = true;
						System.out.println(((Acts) actionsArrList.get(i)).getCharacterName());
					}
			}
			if (found == false)
				System.out.println("Movie not found.");
		}
	}
	
	@Override
	public String toString()
	{
		return "Acts [role=" + role + ", characterName=" + characterName + ", actor=" + person.getName() + ", movie=" + movie
				+ ", actionsArrList=" + actionsArrList + "]";
	}
}