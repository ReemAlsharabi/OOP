import java.time.LocalDate;
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
	//private ImageType poster;
	
	public Movie()
	{
		id = UUID.randomUUID().toString();
		addedDate = LocalDate.now();
		numOfMovies += 1;
	}
	public Movie(String name, LocalDate showDate, String description, String genre)
	{
		id = UUID.randomUUID().toString();
		this.name = name;
		this.showDate = showDate;
		this.description = description;
		this.genre = genre;
		addedDate = LocalDate.now();
		numOfMovies += 1;
		//this.image = image;
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
	@Override
	public String toString()
	{
		return "Movie [id=" + id + ", name=" + name + ", showDate=" + showDate + ", description=" + description
				+ ", genre=" + genre + "]";
	}
}
