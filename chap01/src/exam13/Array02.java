//58page
package exam13;

public class Array02 {

	public static void main(String[] args) {
		String[] str = new String[4];
		str[0] = "������";
		str[1] = "������";
		str[2] = "�����";
		str[3] = new String("������");
		
		System.out.println("str[0]�� str[1]�� �ּ� �� : " + (str[0] == str[1]));
		System.out.println("str[0]�� str[3]�� �ּ� �� : " + (str[0] == str[1]));
		System.out.println("str[0]�� str[1]�� ���ڿ� �� : " + (str[0].equals(str[3])));
		System.out.println("str[0]�� str[2]�� ���ڿ� �� : " + (str[0].equals(str[2])));
	}
}
