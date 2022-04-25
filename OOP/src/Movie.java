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
	private ArrayList<Producer> producersArrList = new ArrayList<Producer>();
	private ArrayList<Writer> writersArrList = new ArrayList<Writer>();
	private ArrayList<Director> directorsArrList = new ArrayList<Director>();
	private ImageType poster;
	
	public Movie()
	{
		id = UUID.randomUUID().toString();
		addedDate = LocalDate.now();
		numOfMovies += 1;
	}
	public Movie(String name, LocalDate showDate, String description, String genre, ImageType poster)
	{
		id = UUID.randomUUID().toString();
		this.name = name;
		this.showDate = showDate;
		this.description = description;
		this.genre = genre;
		addedDate = LocalDate.now();
		numOfMovies += 1;
		this.poster = poster;
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
	
	public ImageType getPoster()
	{
		return poster;
	}
	public void setPoster(ImageType poster)
	{
		this.poster = poster;
	}
	public ArrayList<Producer> getProducersArrList()
	{
		return producersArrList;
	}
	public ArrayList<Writer> getWritersArrList()
	{
		return writersArrList;
	}
	public ArrayList<Director> getDirectorsArrList()
	{
		return directorsArrList;
	}
	
	public void addProducer(Producer producer)
	{
		producersArrList.add(producer);
	}
	public void removeProducer(Producer producer)
	{
		producersArrList.remove(producer);
	}
	
	public void addWriter(Writer writer)
	{
		producersArrList.add(writer);
	}
	public void removeWriter(Writer writer)
	{
		producersArrList.remove(writer);
	}
	
	public void addDirector(Director director)
	{
		producersArrList.add(director);
	}
	public void removeDirector(Director director)
	{
		producersArrList.remove(director);
	}
	
	public void displayProducers()
	{
		if (producersArrList.size() == 0) // if the array is empty
			System.out.println(this.getName() + "\'s Producers Not Found.");
		else
			for (int i = 0; i < producersArrList.size(); i++)
				System.out.println(producersArrList.get(i).getName());
	}
	public void displayWriters()
	{
		if (writersArrList.size() == 0) // if the array is empty
			System.out.println(this.getName() + "\'s Writers Not Found.");
		else
			for (int i = 0; i < writersArrList.size(); i++)
				System.out.println(writersArrList.get(i).getName());
	}
	public void displayDirectors()
	{
		if (directorsArrList.size() == 0) // if the array is empty
			System.out.println(this.getName() + "\'s Directors Not Found.");
		else
			for (int i = 0; i < directorsArrList.size(); i++)
				System.out.println(directorsArrList.get(i).getName());
	}
	
	@Override
	public String toString()
	{
		return "Movie [id=" + id + ", name=" + name + ", showDate=" + showDate + ", description=" + description
				+ ", genre=" + genre + ", numOfMovies=" + numOfMovies + ", producersArrList=" + producersArrList + ", writersArrList=" + writersArrList +", directorsArrList=" + directorsArrList +"]";
	}
	
}