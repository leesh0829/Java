package ex13;

public class Student extends People{
	public int stuNum;	//�й� ����
	
	public Student(String name, String ssn, int stuNum) {	//�̸�, �ֹ��� �ʱ�ȭ�ϴ� ���� Ŭ������ ���Խ�Ű�� super�Լ��� �й� �ʱ�ȭ�ϴ� ������ ����
		super(name, ssn);
		this.stuNum = stuNum;
	}
}
