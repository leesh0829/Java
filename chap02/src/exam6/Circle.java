package exam6;

public class Circle {
	
	int radius; //필드 선언
	
	public Circle(int radius) //생성자
	{
		this.radius = radius; //객세 생성시 필드 세팅
	}
	
	public double area(double area)
	{
		return area = 3.14 * radius * this.radius; //radius 필드 호출하여 사용
	}
}
