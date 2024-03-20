package ex03;

public class Korean {
	
	public static String nation = "Korean";
	
	String name;
	String gender;
	int birth;
	
	public Korean(String name, String gender, int birth) {
		this.name = name;
		this.birth = birth;
		this.gender = gender;
	}
	
	public static void printNation() {
		System.out.printf("국적: %s \n", nation);
	}
	
	public void print() {
		System.out.printf("이름: %s \t 성별: %s \t 생년월일: %d", name, gender, birth);
	}
}
