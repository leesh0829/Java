package ex18;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		for(int i = 0; i<30; i++)
		{
			int event = c.run();
			
			switch(event) {
			
			case 1:
				c.fl = new HankookTire("���� ��", 15);
				System.out.println(c.fl.location + " HankookTire�� ��ü");
				break;
			case 2:
				c.fr = new HankookTire("������ ��", 13);
				System.out.println(c.fr.location + " HankookTire�� ��ü");
				break;
			case 3:
				c.bl = new KumhoTire("���� ��", 14);
				System.out.println(c.bl.location + " KumhoTire�� ��ü");
				break;
			case 4:
				c.br = new KumhoTire("������ ��", 17);
				System.out.println(c.br.location + " KumhoTire�� ��ü");
				break;
			}
			System.out.println("----------------------------");
			
			c.result = 0;
		}
	}

}
