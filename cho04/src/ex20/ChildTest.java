package ex20;

public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Child();	//�ڵ� Ÿ�� ��ȯ
		
		p.f1 = "data";	//�θ� Ŭ������ �ִ� �޼ҵ�, �ʵ� ��� ����
		p.m1();
		p.m2();	//�ڽ� Ŭ������ ������, ������ �� �޼ҵ�, �ʵ� ��밡��
		
		//p.f2 = "base";	//�ڽ� Ŭ���� ��� X
		//p.m3();
		
		Child ch = (Child)p;	//���� Ÿ�� ��ȯ 
		ch.f2 = "yyy";	//�ڽ� Ŭ����
		ch.m3();	//�ڽ� Ŭ����
		
		p.f1 = "ronaldo";
		p.m1();
	}

}
