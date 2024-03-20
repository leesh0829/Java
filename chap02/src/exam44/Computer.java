package exam44;

public class Computer {
	public int add(int[] a) 
	{	
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}
	
//	public double ave(int ... b) //int[] a 라고 선언해도 됨
//	{
//		int sum = 0;
//
//		for(int i = 0; i < b.length; i++)
//			sum += b[i];
//
//		return (double)sum/b.length;
//	}
	
	public double ave(int ... b)
	{
		int sum = 0;
		
		for(int i: b)
			sum += i;
		
		return (double)sum/b.length;
	}
}
