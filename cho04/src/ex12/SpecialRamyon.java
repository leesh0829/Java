package ex12;

public class SpecialRamyon extends Ramyon{ //default 인스턴스 문자열
	String topping;
	
	public SpecialRamyon(String topping)
	{
		this.topping = topping;
	}
	
	void outtopping()
	{
		System.out.println(topping + "을(를) 넣는다.");
	}
}
