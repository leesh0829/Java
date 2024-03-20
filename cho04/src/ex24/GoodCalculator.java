package ex24;

public class GoodCalculator extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double result = 0;
		for(int i = 0; i < a.length; i++)
			result = result + a[i];
		return result / a.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalculator gc = new GoodCalculator();
		System.out.println(" µ¡¼À °á°ú = " + gc.add(2, 3));
		System.out.println(" »¬¼À °á°ú = " + gc.subtract(2, 3));
		System.out.println(" Æò±Õ = " + gc.average(new int[] {1, 2, 3, 4, 5, 6}));
		
		System.out.println();
		
		Calculator c = new GoodCalculator();
		System.out.println(" µ¡¼À °á°ú = " + c.add(2, 3));
		System.out.println(" »¬¼À °á°ú = " + c.subtract(2, 3));
		System.out.println(" Æò±Õ = " + c.average(new int[] {1, 2, 3, 4, 5, 6}));
	}

}
