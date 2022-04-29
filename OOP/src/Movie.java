import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Movie
{
	private String id;
	private String name;
	private LocalDate showDate; //LocalDate.of(1980, Month.JANUARY, 1);
	private LocalDate addedDate;
	private String description;
	private String genre;
	private static int numOfMovies = 0;
	private ArrayList<Director> directorsArrList = new ArrayList<Director>();
	private ArrayList<String> awardsArrList = new ArrayList<String>();
	private String quote;
	private Image poster;
	private ArrayList<Image> imageArrList = new ArrayList<Image>();
	
	public Movie()
	{
		super();
		id = UUID.randomUUID().toString();
		addedDate = LocalDate.now();
		numOfMovies += 1;
	}
	public Movie(String name, LocalDate showDate, String description, String genre,  String quote, String award, Director director)
	{
		id = UUID.randomUUID().toString();
		this.name = name;
		this.showDate = showDate;
		this.description = description;
		this.genre = genre;
		addedDate = LocalDate.now();
		numOfMovies += 1;
		this.quote = quote;
		awardsArrList.add(award);
		directorsArrList.add(director);
		
	}
	public Movie(String name, LocalDate showDate, String description, String genre, Image poster, String quote, String award, Director director)
	{
		id = UUID.randomUUID().toString();
		this.name = name;
		this.showDate = showDate;
		this.description = description;
		this.genre = genre;
		addedDate = LocalDate.now();
		numOfMovies += 1;
		this.poster = poster;
		this.quote = quote;
		awardsArrList.add(award);
		directorsArrList.add(director);
		
	}

	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public LocalDate getShowDate()
	{
		return showDate;
	}

	public void setShowDate(LocalDate showDate)
	{
		this.showDate = showDate;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getGenre()
	{
		return genre;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public LocalDate getAddedDate()
	{
		return addedDate;
	}
	public static int getNumOfMovies()
	{
		return numOfMovies;
	}
	
	public Image getPoster()
	{
		return poster;
	}
	public void setPoster(Image poster)
	{
		this.poster = poster;
	}
	
	public ArrayList<Director> getDirectorsArrList()
	{
		return directorsArrList;
	}
	
	public void addDirector(Director director)
	{
		directorsArrList.add(director);
	}
	
	public ArrayList<Image> getImageArrayList()
	{
		return imageArrList;
	}
	
	public void addImageArrList(Image image)
	{
		imageArrList.add(image);
	}
	public void displayDirectors()
	{
		if (directorsArrList.size() == 0) // if the array is empty
			System.out.println(this.getName() + "\'s Directors Not Found.");
		else
			for (int i = 0; i < directorsArrList.size(); i++)
				System.out.println(directorsArrList.get(i).getName());
	}
	public void addAward(String award)
	{
		awardsArrList.add(award);
	}
	public void removeAward(String award)
	{
		awardsArrList.remove(award);
	}
	public void displayAwards()
	{
		for (int i = 0; i < awardsArrList.size(); i++)
			System.out.println(awardsArrList.get(i));
	}
	
	public String getQuote()
	{
		return quote;
	}
	public void setQuote(String quote)
	{
		this.quote = quote;
	}
	public ArrayList<String> getAwardsArrList()
	{
		return awardsArrList;
	}
	
	@Override
	public String toString()
	{
		return "Movie [id=" + id + ", name=" + name + ", showDate=" + showDate + ", addedDate=" + addedDate
				+ ", description=" + description + ", genre=" + genre + ", directorsArrList=" + directorsArrList
				+ ", awardsArrList=" + awardsArrList + ", quote=" + quote + ", poster=" + poster + "]";
	}
	
	
}