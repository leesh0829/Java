package exam1;

public class Vehicle {
	
	String company;
	String kind;
	String color;
	
	public Vehicle(String company)
	{
		this(company, "bus", "���");
	}
	
	public Vehicle(String company, String kind)
	{
		this(company, kind, "��Ȳ");
	}
	
	public Vehicle(String company, String kind, String color)
	{
		this.company = company;
		this.kind = kind;
		this.color = color;
	}
}
