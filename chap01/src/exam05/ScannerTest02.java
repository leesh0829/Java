package exam05;
// Scanner Ŭ������ �پ��� �޼ҵ带 �̿��Ͽ� ������ �Է� �ޱ�  
import java.util.Scanner; // scanner Ŭ������ ��ġ�� �����Ϸ����� �˷��ֱ�

public class ScannerTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//scanner ��ü �����ϱ�
		
		System.out.print("�λ繮�� �Է��ϼ���.>>"); //�ȳ��ϼ���
		
		String str2 = scan.nextLine();
		
		System.out.print("������ �Է����ּ���>>"); //jin dal_rae 2203
		
		String fn = scan.next();
		String name = scan.next();
		int num = scan.nextInt();
		String str1 = scan.nextLine();
		
		
		System.out.printf("��= %s\n", fn);
		System.out.printf("�̸�= %s\n", name);
		System.out.printf("�й�= %d\n", num);
		System.out.printf(str2);
	}

}
