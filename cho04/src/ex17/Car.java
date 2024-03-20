package ex17;

public class Car {
	
	Tire flt = new Tire("왼쪽 앞", 6); 
	Tire frt = new Tire("오른쪽 앞", 2);
	Tire blt = new Tire("왼쪽 뒤", 3);
	Tire brt = new Tire("오른쪽 뒤", 4);
	
	public void stop()
	{
		System.out.println("[자동차가 멈춥니다.]");
	}

	public int run() 
	{
		System.out.println("자동차가 달립니다.");
		
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
