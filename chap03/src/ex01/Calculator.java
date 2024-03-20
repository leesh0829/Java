package ex01;

public class Calculator {
	public int adder(int ...a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		
		System.out.printf("�׸� ���� �� = %d\n", sum);
		return sum;
	}
	
	public double average(int ...b) {
		double avg = (double)adder(b)/b.length;
		System.out.printf("�׸� ���� ��� = %.3f\n", avg);
		return avg;
	}
}
