package exam1;

public class Car {
	String company = "KIA";
	String model;
	String color;
	int maxspeed;
	
	public Car()
	{
		
	}
	
	public Car(String model)
	{
		this.model = model;
	}
	
	public Car(String model, String color)
	{
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color, int maxspeed)
	{
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
