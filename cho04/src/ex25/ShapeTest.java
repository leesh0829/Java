package ex25;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape sh = new Triangle();
		
		sh.draw();
		sh.area(5, 10);
		
		System.out.println("------------------");
		
		sh = new Rectangle();
		
		sh.draw();
		sh.area(5, 10);
	}

}
