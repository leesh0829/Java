package exam6;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle[] c = new Circle[5];
		
//		c[0] = new Circle(10);
//		c[1] = new Circle(20);
//		c[2] = new Circle(30);
//		c[3] = new Circle(40);
//		c[4] = new Circle(50);
		
		for(int i = 0; i<c.length; i++) {
			c[i] = new Circle((i+1)*10);
		}
		
		for(int i = 0; i < c.length; i++)
		System.out.println("c[" + i + "]가 참조하고 있는 원의 넓이: " + c[i].area(i));
	}

}
