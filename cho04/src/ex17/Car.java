package ex17;

public class Car {
	
	Tire flt = new Tire("���� ��", 6); 
	Tire frt = new Tire("������ ��", 2);
	Tire blt = new Tire("���� ��", 3);
	Tire brt = new Tire("������ ��", 4);
	
	public void stop()
	{
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

	public int run() 
	{
		System.out.println("�ڵ����� �޸��ϴ�.");
		
		if(flt.roll() == false)
		{
			stop();
			return 1;
		}
		if(frt.roll() == false)
		{
			stop();
			return 2;
		}
		if(blt.roll() == false)
		{
			stop();
			return 3;
		}
		if(brt.roll() == false)
		{
			stop();
			return 4;
		}
		return 0;
	}
}
