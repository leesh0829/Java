package exam12;

public class Array04 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		System.out.println("배열길이" + a.length);
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = a.length - i;
			System.out.printf("a[%d] = %d", i, a[i]);
		}
	}

}
