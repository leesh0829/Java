package exam5;

public class IncreaseTest {

	public static void main(String[] args) {
		
		Increase i1 = new Increase();
		
		int[] a = {1,2,3};
		
		System.out.println("�޼ҵ� ��� ��");
		
		for(int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = %d\n", i, a[i]);
		
		System.out.println();
		i1.Increase(a); // {2,3,4}
		
//		System.out.println("�޼ҵ� ��� ��");
		
//		System.out.println(i1.Increase(new int[] {1,2,3}));
		
//		for(int i = 0; i < a.length; i++)
//			System.out.printf("a[%d] = %d\n", i, a[i]);
	}

}
