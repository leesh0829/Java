package test;

public class Test {

	public static void main(String[] args) {
		int v3 = 10;
		int v2  = -3;
		char ch = 'd';
		
		System.out.println("ch+v2 = " + ch + v2); //두 +가 같은 우선순위기 때문에 왼쪽 부터 오른쪽부터 연산, +는 다 문자열 결합연산을 함
		System.out.println("ch+v2 = " + (int)ch + v2);//d유니코드가 숫자로 변경되지만 문자열 연산함
		System.out.println("ch+v2 = " + (char)ch + v2);//1번과 동일
		System.out.println("ch+v2 = " + ch + (char)v2);
		System.out.println("ch+v2 = " + (int)(ch + v2));//둘의 결과 값이 유니코드+정수가 정수타입으로 97로 나옴
		System.out.println("ch+v2 = " + (char)(ch + v2)); //둘의 연산을 먼저하고 유니코드로 출력
		System.out.println("v1%v2 = " + v3 % v2);
	}

}
