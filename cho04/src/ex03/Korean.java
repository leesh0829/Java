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
		System.out.printf("����: %s \n", nation);
	}
	
	public void print() {
		System.out.printf("�̸�: %s \t ����: %s \t �������: %d", name, gender, birth);
	}
}
