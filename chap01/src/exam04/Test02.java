package exam04;
//�⺻ Ÿ�� ���� ���ڿ��� ��ȯ�ϱ�: String Ŭ������ �ִ� valueOf()�޼ҵ� ���
public class Test02 {

	public static void main(String[] args) {
		int num1 = 123;
		int num2 = 35;
		String str1 = String.valueOf(num1);
		String str2 = String.valueOf(num2);
		
		
		String str3 = str1 + str2;
		int result = num1 + num2;
		
		System.out.println(str3);
	}

}
