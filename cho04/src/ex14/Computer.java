package ex14;

public class Computer extends Calculator{
	@Override
	public void Area(int radius) {
		super.Area(radius);
		System.out.println("Computer ��ü�� area() �޼ҵ� ����");
		System.out.println("�� ����: " + Math.PI * radius * radius);
		
	}
}
