package ex25;

public class Triangle extends Shape{
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("»ï°¢Çü ±×¸®±â");
	}
	
	@Override
	public double area(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + (double)a * b / 2);
		return a * b / 2;
	}

}
