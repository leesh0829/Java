package exam12;

public class Array05 {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		
		a[0] = 83;
		a[1] = 90;
		a[2] = 87;
		
		int sum = 0;
		
		for(int i = 0; i<a.length; i++)
			sum = sum + a[i];
		
		float ave = (float)sum/a.length;
		
		System.out.printf("�迭 a�� �׸��� ��: %d \n", sum);
		System.out.printf("�迭 a�� �׸��� ���: %.3f", ave);
		
		
	}

}
