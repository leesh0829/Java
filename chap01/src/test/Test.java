package test;

public class Test {

	public static void main(String[] args) {
		int v3 = 10;
		int v2  = -3;
		char ch = 'd';
		
		System.out.println("ch+v2 = " + ch + v2); //�� +�� ���� �켱������ ������ ���� ���� �����ʺ��� ����, +�� �� ���ڿ� ���տ����� ��
		System.out.println("ch+v2 = " + (int)ch + v2);//d�����ڵ尡 ���ڷ� ��������� ���ڿ� ������
		System.out.println("ch+v2 = " + (char)ch + v2);//1���� ����
		System.out.println("ch+v2 = " + ch + (char)v2);
		System.out.println("ch+v2 = " + (int)(ch + v2));//���� ��� ���� �����ڵ�+������ ����Ÿ������ 97�� ����
		System.out.println("ch+v2 = " + (char)(ch + v2)); //���� ������ �����ϰ� �����ڵ�� ���
		System.out.println("v1%v2 = " + v3 % v2);
	}

}
