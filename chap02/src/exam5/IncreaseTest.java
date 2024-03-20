package exam5;

public class IncreaseTest {

	public static void main(String[] args) {
		
		Increase i1 = new Increase();
		
		int[] a = {1,2,3};
		
		System.out.println("메소드 사용 전");
		
		for(int i = 0; i < a.length; i++)
			System.out.printf("a[%d] = %d\n", i, a[i]);
		
		System.out.println();
		i1.Increase(a); // {2,3,4}
		
//		System.out.println("메소드 사용 후");
		
//		System.out.println(i1.Increase(new int[] {1,2,3}));
		
//		for(int i = 0; i < a.length; i++)
//			System.out.printf("a[%d] = %d\n", i, a[i]);
	}

}
