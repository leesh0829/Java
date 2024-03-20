package ex21;

public class InstanceofTest {

static public void m1(Parent p)
{
	if(p instanceof Child)
	{
		Child c = (Child) p;
		System.out.println("m1() - Child 타입으로 강제 타입 변환 성공");
	}
	else
	{
		System.out.println("m1() - Child 타입을 강제타입 변환 불가능");
	}
}

static public void m2(Parent p)
{
	Child c = (Child) p;
	System.out.println("m2() - Child 타입으로 강제 타입 변환");
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
