package ex21;

public class InstanceofTest {

static public void m1(Parent p)
{
	if(p instanceof Child)
	{
		Child c = (Child) p;
		System.out.println("m1() - Child Ÿ������ ���� Ÿ�� ��ȯ ����");
	}
	else
	{
		System.out.println("m1() - Child Ÿ���� ����Ÿ�� ��ȯ �Ұ���");
	}
}

static public void m2(Parent p)
{
	Child c = (Child) p;
	System.out.println("m2() - Child Ÿ������ ���� Ÿ�� ��ȯ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Child();
		m1(p1);
		m2(p1);
		
		System.out.println("----------------------");
		
		Parent p2 = new Parent();
		m1(p2);
		//m2(p2);
	}

}
