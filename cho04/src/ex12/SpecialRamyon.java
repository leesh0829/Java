package ex12;

public class SpecialRamyon extends Ramyon{ //default �ν��Ͻ� ���ڿ�
	String topping;
	
	public SpecialRamyon(String topping)
	{
		this.topping = topping;
	}
	
	void outtopping()
	{
		System.out.println(topping + "��(��) �ִ´�.");
	}
}
