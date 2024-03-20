package exam8;

import exam5.Increase;

public class IncreaseTest {

	public static void main(String[] args) {
		
		Increase in = new Increase();
		int[] a = {1,2,3};
		in.Increase(a);
		
		//1.increase(new int[] {1,2,3});
		
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("a[%d] = %d\t", i, a[i]);
		}
	}

}
