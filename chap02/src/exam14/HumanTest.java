package exam14;

public class HumanTest {

	public static void main(String[] args) {
		
		Human h1 = new Human(); //Human ��ü ����
		
		h1.name = "�浿"; //�ʵ� �� ����
		h1.height = 175; //�ʵ� �� ����
		h1.weight = 65; //�ʵ� �� ����
		
		System.out.println(h1.name);
		System.out.println(h1.height + "cm");
		System.out.println(h1.weight + "kg");
	}

}
