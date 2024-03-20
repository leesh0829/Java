package ex06;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("한동민", "060829-3154816");
		
		System.out.println("국적: " + p1.nation);
		System.out.println("이름: " + p1.name);
		System.out.println("주민번호: " + p1.ssn);
		
		//p1.nation = "도미니칸"; final로 초기화 한건 다시 못 바꿈
		//p1.ssn = "283918490-81904901"
		
		p1.name = "한유섬";
		System.out.println("수정한 이름: " + p1.name);
	}

}
