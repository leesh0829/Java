package ex06;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("�ѵ���", "060829-3154816");
		
		System.out.println("����: " + p1.nation);
		System.out.println("�̸�: " + p1.name);
		System.out.println("�ֹι�ȣ: " + p1.ssn);
		
		//p1.nation = "���̴�ĭ"; final�� �ʱ�ȭ �Ѱ� �ٽ� �� �ٲ�
		//p1.ssn = "283918490-81904901"
		
		p1.name = "������";
		System.out.println("������ �̸�: " + p1.name);
	}

}
