package ex18;

public class Tire {
	
	String location; //Tire ��ġ
	int max;	//Tire�� �ִ� ����
	int accum;	//Tire�� ���� ȸ����
	
	Tire(String location, int max) {
		this.location = location;
		this.max = max;
	}
	
	boolean roll() {	//Tire�� ������ ���, Tire�� ������ ���� �� True��, ��ũ�� ���ٸ� False���
		accum++;
	
		if(accum < max) {
			System.out.println(location + " Tire " + "���� ����: " + (max-accum));
			return true;
		}
		else {
			System.out.println("��ũ");
			return false;
		}
	}
}
