package exam14;

public class HumanTest {

	public static void main(String[] args) {
		
		Human h1 = new Human(); //Human 객체 생성
		
		h1.name = "길동"; //필드 값 변경
		h1.height = 175; //필드 값 변경
		h1.weight = 65; //필드 값 변경
		
		System.out.println(h1.name);
		System.out.println(h1.height + "cm");
		System.out.println(h1.weight + "kg");
	}

}
