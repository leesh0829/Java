package ex17;

public class Tire {
	public String location; //Ÿ�̾� ��ġ
	public int max;	//�ִ� ȸ����
	public int accum;	//���� ȸ����
	
	public Tire(String location, int max) {
		this.location = location; 
		this.max = max;
	}
	
	public boolean roll() { //����Ƚ�� ����, ��ũ ���� Ȯ���� ����
		accum++;
		
		if(accum < max)
		{
			System.out.printf("%sTire ����: %dȸ\n", location, max - accum);
			return true;
		}
		else 
		{
			System.out.printf("*** %s Tire ��ũ ***\n", location);
			return false;
		}
	}
}
