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
			System.out.printf("%sHakookTire ����: %dȸ\n", location, max - accum);
			return true;
		}
		else 
		{
			System.out.printf("*** %sHankookTire ��ũ ***\n", location);
			return false;
		}
	}
}
