package exam1;

public class KoreanExam {
	
	public static void main(String[] args) {
	
		Korean k1 = new Korean("아델리", 10);
		Koreann k2 = new Koreann("황제", 2);
		
		System.out.println("국적: " + k1.national);
		System.out.println("이름: " + k1.name);
		System.out.println("나이: " + k1.age);
		System.out.println();
		System.out.println("국적: " + k2.national);
		System.out.println("이름: " + k2.name);
		System.out.println("나이: " + k2.age);
		
	}

}
