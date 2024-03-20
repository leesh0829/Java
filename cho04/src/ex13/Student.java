package ex13;

public class Student extends People{
	public int stuNum;	//학번 생성
	
	public Student(String name, String ssn, int stuNum) {	//이름, 주번을 초기화하는 상위 클래스를 대입시키는 super함수와 학번 초기화하는 생성자 생성
		super(name, ssn);
		this.stuNum = stuNum;
	}
}
