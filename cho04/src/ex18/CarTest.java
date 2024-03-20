package ex18;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		for(int i = 0; i<30; i++)
		{
			int event = c.run();
			
			switch(event) {
			
			case 1:
				c.fl = new HankookTire("왼쪽 앞", 15);
				System.out.println(c.fl.location + " HankookTire로 교체");
				break;
			case 2:
				c.fr = new HankookTire("오른쪽 앞", 13);
				System.out.println(c.fr.location + " HankookTire로 교체");
				break;
			case 3:
				c.bl = new KumhoTire("왼쪽 뒤", 14);
				System.out.println(c.bl.location + " KumhoTire로 교체");
				break;
			case 4:
				c.br = new KumhoTire("오른쪽 뒤", 17);
				System.out.println(c.br.location + " KumhoTire로 교체");
				break;
			}
			System.out.println("----------------------------");
			
			c.result = 0;
		}
	}

}
