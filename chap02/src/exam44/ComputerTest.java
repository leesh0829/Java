package exam44;

public class ComputerTest {

	public static void main(String[] args) {
		Computer com = new Computer(); //��ü ����
		
		int[] array = {1,2,3,4,5};
		
		System.out.println("�迭 �׸� ���� ��: " + com.add(array));
		System.out.println("�迭 �׸� ���� ���: " + com.ave(array));
		System.out.println("�迭 �׸� ���� ���: " + com.ave(new int[] {2,3,4,5,6}));
		
		System.out.println("�迭 �׸� ���� ���: " + com.ave(2,3,4,5,6));
	}

}
