package exam12;
//51page
public class Array02 {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		String[] b = new String[3];
		boolean[] c = new boolean[3];
		
		a = null;
		b = null;
		c = null;
		
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("a[%d] = %d \n", i, a[i]);
			System.out.printf("b[%d] = %s \n", i, b[i]);
			System.out.printf("b[%d] = %b \n", i, c[i]);
			System.out.println();
		}
	}

}
