package exam02;
//exam02 ��Ű�� �ȿ� Test01Ŭ������ ������.

public class Test01 {

	public static void main(String[] args) { //����()�޼ҵ� ��  Ŭ������ ���� Ŭ������ ��� �ݵ�� ����()�޼ҵ� �ʿ�
		//byte b1 = 12;
		//byte b2 = 127; //-7 ~ 127���� 
		short s1 = 12;
		int x1 = 12;
		int x2 = 0b1100; //B�� ����
		int x3 = 014; 
		int x4 = 0xc; //C�� ����
		//int x5 = 2200000000; //21�� �󸶱��� ����
		long x5 = 2200000000l; //long �ڿ��� l�ٿ��� ��
		int x6 = 'a'; //�����ڵ� 0 ~ 65535
		char c1 = 69; //char �����Է� ����
		char c2 = '\u0041'; //16����
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		System.out.println("x5 = " + x5);
		System.out.println("x6 = " + x6);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}

}
