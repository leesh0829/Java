package exam08;
// ���ڿ� �� ����
public class OperatorTest02 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";//���ڿ� ���ͷ��� ������� ��ü�� �ߺ��Ǽ� �ȸ������
		String str3 = new String("java"); //new �����ڴ� ���ο� ��ü�� ����
		String str4 = "JAVA";
		
		boolean b1 = (str1 == str2); //�ּ� ���̰� ���ڿ� �� �ƴ�
		boolean b2 = (str1 == str3); //�ּ� ���̰� ���ڿ� �� �ƴ�
		boolean b3 = (str1.equals(str3)); //�ּ� ���̰� ���ڿ� �� �ƴ�
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
