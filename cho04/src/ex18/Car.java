package ex18;

public class Car {
	
	int result = 0;
	
	Tire fl = new Tire("���� ��", 6);		//�θ� Ŭ���� Ÿ�� �ʵ� - �θ�ü, �ڽ� ��ü
	Tire fr = new Tire("������ ��", 2);
	Tire bl = new Tire("���� ��", 3);
	Tire br = new Tire("������ ��", 4);
	
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		
		if(fl.roll() == false) {
			stop();
			result = 1;
		}
		
		if(fr.roll() == false) {
			stop();
			result = 2;
		}
		
		if(bl.roll() == false) {
			stop();
			result = 3;
		}
		
		if(br.roll() == false) {
			stop();
			result = 4;
		}
		
		return result;
	}
}
