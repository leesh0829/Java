package exam10;

public class Retangle {
	
	public int areaRec(int x) { //���簢��
		System.out.printf("���簢���� ���� = %d * %d = %d\n", x, x, (x*x));
		return x*x;
	}
	
	public int areaRec(int w, int h)
	{
		System.out.printf("���簢���� ���� = %d * %d = %d\n", w, h, (w*h));
		return w*h;
	}
	
	public double areaRec(double w, double h)
	{
		System.out.printf("���簢���� ���� = %.1f * %.1f = %.2f\n", w, h, (w*h));
		return w*h;
	}
}
