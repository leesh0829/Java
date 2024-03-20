package exam5;

public class Increase {
	
	public void Increase(int[] a) 
	{
		for(int i = 0; i < a.length; i++)
		{
			a[i] += 1;
			//a[i] = a[i] + 1;
			//a[i]++;
			System.out.println(a[i]);
		}
	}
}
