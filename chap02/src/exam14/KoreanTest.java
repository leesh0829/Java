package exam14;

public class KoreanTest {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("penguin", "1234-56789");
		
		System.out.println("국적: " + k1.nation);
		System.out.println("이름: " + k1.name);
		System.out.println("고유번호: " + k1.ssn);
		
	}

}
