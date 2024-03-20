package exam2;

public class Tv {
	
	int size;
	String manufacturer;
	
	public Tv()
	{
		this(32, "LG");
	}
	
	public Tv(String manufacturer)
	{
		this(64,manufacturer);
	}
	
	public Tv(int size, String manufacturer)
	{
		this.size = size;
		this.manufacturer = manufacturer;
	}
}
