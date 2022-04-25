import java.awt.Image;
import java.util.ArrayList;

public class MovieEcosystem extends Person
{
	private String birthPlace;
	private ArrayList<String> awards;
	private String info;
	private Image image;

	public MovieEcosystem(String b, String i)
	{
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
		return "MovieEcosystem [birthPlace=" + birthPlace + ", awards=" + awards + ", information=" + info + ", image="
				+ image + "]";
	}
}
