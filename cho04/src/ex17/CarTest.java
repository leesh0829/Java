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
				System.out.printf("���� �� Hankook Tire ��ü\n");
				myCar.flt = new HankookTire("���� ��", 10);
				break;
			case 2:
				System.out.printf("������ �� Hankook Tire ��ü\n");
				myCar.frt = new HankookTire("������ ��", 10);
				break;
			case 3:
				System.out.printf("���� �� Kumbo Tire ��ü\n");
				myCar.blt = new KumboTire("���� ��", 10);
				break;
			case 4:
				System.out.printf("������ �� Kumbo Tire ��ü\n");
				myCar.brt = new KumboTire("������ ��", 10);
				break;
			}
			
			System.out.println("----------------------------");
		}
	}

}
