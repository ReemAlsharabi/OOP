import java.awt.Image;
import java.time.LocalDate;
import java.util.ArrayList;

public class MovieEcosystem extends Person
{
	private String birthPlace;
	private ArrayList<String> awards;
	private String info;
	private Image image;
	
	public MovieEcosystem() 
	{
		super();
		birthPlace = null;
		awards = new ArrayList<String>();
		info = null;
		image = new Image();
	}

	public MovieEcosystem(String name, String email, String mobile, LocalDate birthDate, String b, String i)
	{
		super(name, email, mobile, birthDate);
		birthPlace = b;
		awards = new ArrayList<String>();
		info = i;
		image = new Image();
	}

	public String getBirthPlace()
	{
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace)
	{
		this.birthPlace = birthPlace;
	}

	public ArrayList getAwards()
	{
		return awards;
	}

	public String getInfo()
	{
		return info;
	}

	public void setInfo(String info)
	{
		this.info = info;
	}

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public void addAward(String a)
	{
		awards.add(a);
	}

	@Override
	public String toString()
	{
		return super.toString() + "MovieEcosystem [birthPlace=" + birthPlace + ", awards=" + awards + ", information=" + info + ", image="
				+ image + "]";
	}
}
