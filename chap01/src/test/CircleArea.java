package test;
//���� ������ ��ȣ�� ���̸� ����Ͽ� ����ϴ� ���α׷� �ۼ��Ͻÿ�.(����:������ PI�� 3.14�� ����� �����Ѵ�. ���� ������(radius)�� 2.6�̴�
// pi R^2 2 PI R
public class CircleArea {

	public static void main(String[] args) {
		final double pi = 3.14;
		double rad = 2.6;
		double ca = pi * rad * rad;
		double al = 2 * pi * rad;
		
		System.out.printf("CircleArea = %f\n", ca);
		System.out.printf("ArtLength = %.3f", al);
	}

}
