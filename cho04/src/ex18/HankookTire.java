package ex18;

public class HankookTire  extends Tire {
	
	HankookTire(String l, int m) {
		super(l, m);	//Tire Ŭ������ ������ ȣ��
	}
	
	
	boolean roll() {	//Tire�� ������ ���, Tire�� ������ ���� �� True��, ��ũ�� ���ٸ� False���
		accum++;
	
		if(accum < max) {
			System.out.println(location + " HankookTire " + "���� ����: " + (max-accum));
			return true;
		}
		else {
			System.out.println(location + "�ѱ� Ÿ�̾� ��ũ");
			return false;
		}
	}
	
}
