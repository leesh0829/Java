package exam10;

public class Retangle {
	
	public int areaRec(int x) { //정사각형
		System.out.printf("정사각형의 넓이 = %d * %d = %d\n", x, x, (x*x));
		return x*x;
	}
	
	public int areaRec(int w, int h)
	{
		System.out.printf("직사각형의 넓이 = %d * %d = %d\n", w, h, (w*h));
		return w*h;
	}
	
	public double areaRec(double w, double h)
	{
		System.out.printf("직사각형의 넓이 = %.1f * %.1f = %.2f\n", w, h, (w*h));
		return w*h;
	}
}
