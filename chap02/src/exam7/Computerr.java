package exam7;

public class Computerr {
	
	public int add(int[] a) 
	{	
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
	public double ave(int[] b)
	{
		return (double)add(b)/b.length;
//		int sum = 0;
//		
//		for(int i: b)
//			sum += i;
		
//		return (double)sum/b.length;
	}
}
