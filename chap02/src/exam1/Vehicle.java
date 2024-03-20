package exam1;

public class Vehicle {
	
	String company;
	String kind;
	String color;
	
	public Vehicle(String company)
	{
		this(company, "bus", "³ì»ö");
	}
	
	public Vehicle(String company, String kind)
	{
		this(company, kind, "ÁÖÈ²");
	}
	
	public Vehicle(String company, String kind, String color)
	{
		this.company = company;
		this.kind = kind;
		this.color = color;
	}
}
