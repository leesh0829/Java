package ex05;

public class Car {
	
	Tire fl = new HankookTire();		//�θ� Ŭ���� Ÿ�� �ʵ� - �θ�ü, �ڽ� ��ü
	Tire fr = new HankookTire();
	Tire bl = new HankookTire();
	Tire br = new HankookTire();
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
	void run() {
		fl.roll();
		fr.roll();
		bl.roll();
		br.roll();
	}
	
	public static void main(String[] args)
	{
		
	}
}
