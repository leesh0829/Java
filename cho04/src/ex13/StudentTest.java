package ex13;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s = new Student("이승현","060829-3154816",20607);	//하위 클래스에 이름, 주번, 학번 입력
		
		System.out.println("이름: " + s.name);	//출력문
		System.out.println("이름: " + s.ssn);
		System.out.println("이름: " + s.stuNum);
	}

}
