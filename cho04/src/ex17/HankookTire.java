package ex17;

public class HankookTire extends Tire{
	public HankookTire(String l, int m)
	{
		super(l, m);
	}
	
	@Override
	public boolean roll() {
		accum++;
		
		if(accum < max)
		{
			System.out.printf("%sHakookTire ¼ö¸í: %dÈ¸\n", location, max - accum);
			return true;
		}
		else 
		{
			System.out.printf("*** %sHankookTire ÆãÅ© ***\n", location);
			return false;
		}
	}
}
