package ex18;

public class KumhoTire  extends Tire {
	
	KumhoTire(String l, int m) {
		super(l, m);	//Tire Ŭ������ ������ ȣ��
	}
	
	
	boolean roll() {	//Tire�� ������ ���, Tire�� ������ ���� �� True��, ��ũ�� ���ٸ� False���
		accum++;
	
		if(accum < max) {
			System.out.println(location + " KumhoTire " + "���� ����: " + (max-accum));
			return true;
		}
		else {
			System.out.println(location + "��ȣ Ÿ�̾� ��ũ");
			return false;
		}
	}
	
}
