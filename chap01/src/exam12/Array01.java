package exam12;

public class Array01 {

	public static void main(String[] args) {
		
		//�迭 ����� ù�� ° ���: �迭�� �� �׸��� �˰��ִ� ��� {1, 2, 3}
		//int[] a = {1, 2, 3};
		//a[0] = 4;
		
		//�迭 ����� �ι� ° ���: �׸��� �𸦰��
		int[] a = new int[6]; //0 //0~5������ ����
		//String[] a = new String[5]; //null
		//double[] a = new double[5]; //0.0
		//boolean[] a = new boolean[5]; //false
		//char[] a = new char[5]; //
		
		a[0] = 95;
		a[2] = 80;
		//a[7] = 90; //5�� ���� ���������� 7���� �ε��� ������ ���� �ʾƼ�
		a[5] = 90;
		
		//a = null;     //null�� �Է��ϸ�, �迭�� �����ϰ� ���� �ʽ��ϴ�
		
		//System.out.println("a[0] = " + a[0]);
		//System.out.println("a[1] = " + a[1]);
		//System.out.println("a[2] = " + a[2]);
		
		//�迭 ����� �� ��° ���   //�迭 ���� �� �׸� ���� �̿��Ͽ� �迭 �����
		//int [] a;
		// a = {1, 2, 3, 4, 5}    // {1, 2, 3, 4, 5}
		a = new int[] {1, 2, 3, 4, 5};
		//a = new int[5] {1, 2, 3, 4, 5}; //[]�ȿ� �ε��� ĭ �Է� ����
		
		for(int i = 0; i < 6; i++) {	
			System.out.printf("a[%d] = %d \n", i, a[i]);
		}
		
	}

}
