package exam04;
//string Ŭ������ ����� ���ڿ��� �⺻ Ÿ������ ��ȯ�ϱ�
public class Test01 {

	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "123";
		String str3 = str1 + str2; //���ڿ� ���տ���: 123123
		
		byte b1 = Byte.parseByte(str1);
		byte b2 = Byte.parseByte("75");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt("32");
		
		double d1 = Double.parseDouble(str2);
		double d2 = Double.parseDouble("23.5");
		
		System.out.println("d1 + d2 = " + (d1 + d2)); //������� �� ���ڿ� ���� ����
		System.out.println("d1 + d2 = " + d1+d2); //���ڿ� ���� ����
		System.out.println(d1+d2); //�������
	}

}
