package ex08;

public class Access01 {

	public static void main(String[] args) {
		Sample01 sam = new Sample01(); //��ü ���� �ٸ� Ŭ�����̱� ����
		
		sam.a = 10;	//public�� ��ü ������ �ϸ� ����
		//sam.b = 20;	//private�� ���� Ŭ���� ���θ� ����
		sam.c = 30;	//default�� ���� ��Ű���̸� ����
	}
}
