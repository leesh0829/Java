package exam04;
// printf���� �پ��� ���� ���ڿ��� ����Ͽ� ����ϱ�
public class Test03 {

	public static void main(String[] args) {
		int x1 = 123;
		int x2 = 120_000;
		int x3 = -256;
		int x4 = 75;
		double d1 = 123.12365678910178;
		String str1 = "������";
		char c1 = '��';
		
		System.out.printf("x1 = %d\n", x1); //��ȣ �� ���� �� ���
		System.out.printf("x1 = %6d\n", x1);
		System.out.printf("x1 = %06d\n", x1);
		System.out.printf("x1 = %-6d\n", x1);
		System.out.printf("%-6d %-6d\n", x1, x1);
		System.out.println(); //��ȣ �ȿ� ���� ���
		
		System.out.printf("x2 = %d\n", x2);
		System.out.printf("x2 = %,d\n", x2); //õ ���� ���� ,�� �����ؼ� ���
		System.out.println();
		
		System.out.printf("x3 = %d\n", x3);
		System.out.printf("x3 = %(d\n", x3); //��ȣ ����� -����
		
		System.out.printf("x4 = %xd\n", x4); 
		System.out.printf("x4 = %x\n", x4); //16����
		System.out.printf("x4 = %#x\n", x4);
		System.out.printf("x4 = %o\n", x4); //8����
		System.out.printf("x4 = %#o\n", x4);
		System.out.println();
		
		System.out.printf("d1 = %f\n", d1); //�Ǽ� (�Ҽ� �� 6�ڸ� ���� ���� �ݿø�:7�ڸ�����)
		System.out.printf("d1 = %.14f\n", d1); 
		System.out.printf("d1 = %.3f\n", d1); 
		
		System.out.printf("str1 = %s\n", str1);
		System.out.printf("c1 = %c\n", c1);
	}

}
