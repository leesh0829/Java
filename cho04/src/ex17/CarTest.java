package ex17;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		for(int i = 0; i < 10; i++)
		{
			int event = myCar.run(); 
				
			switch(event)
			{
			case 1:
				System.out.printf("왼쪽 앞 Hankook Tire 교체\n");
				myCar.flt = new HankookTire("왼쪽 앞", 10);
				break;
			case 2:
				System.out.printf("오른쪽 앞 Hankook Tire 교체\n");
				myCar.frt = new HankookTire("오른쪽 앞", 10);
				break;
			case 3:
				System.out.printf("왼쪽 뒤 Kumbo Tire 교체\n");
				myCar.blt = new KumboTire("왼쪽 뒤", 10);
				break;
			case 4:
				System.out.printf("오른쪽 뒤 Kumbo Tire 교체\n");
				myCar.brt = new KumboTire("오른쪽 뒤", 10);
				break;
			}
			
			System.out.println("----------------------------");
		}
	}

}
