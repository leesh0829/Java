package ex17;

public class KumboTire extends Tire{	//Tire ���
	public KumboTire(String l, int m)	//�θ� Ŭ������ Tire�޼ҵ� ����ִ� super�Լ�
	{
		super(l, m);
	}
	
	public boolean roll()	//��� Ŭ���� roll�޼ҵ�� ����ϰ� �̸��� �ٲ㼭 �ۼ�
	{
		accum++;
		
		if(accum < max)
		{
			System.out.printf("%sKumhoTire ����: %dȸ\n", location, max - accum);
			return true;
		}
		else 
		{
			System.out.printf("*** %sKumhoTire ��ũ ***\n", location);
			return false;
		}
	}
}
