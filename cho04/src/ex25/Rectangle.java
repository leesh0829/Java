package ex25;

public class Rectangle extends Shape{
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢�� �׸���");
		
	}
	
	@Override
	public double area(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("�簢���� ����: " + (double)a * b);
		return a * b;
	}
}
