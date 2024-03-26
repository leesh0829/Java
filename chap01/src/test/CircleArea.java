package test;
//원의 면적과 원호의 길이를 계산하여 출력하는 프로그램 작성하시오.(조건:원주율 PI는 3.14로 상수로 지정한다. 원의 반지름(radius)는 2.6이다
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
