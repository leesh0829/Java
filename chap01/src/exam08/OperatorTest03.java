package exam08;
// 타입이 다른변수의 동등연산
public class OperatorTest03 {

	public static void main(String[] args) {
		int a = 1;
		double b = 1.0;
		System.out.println("a==b:" + (a==b)); //연산과정에서 int가 double타입으로 변경됨
		
		double c = 0.1;
		float d = 0.1f;
		System.out.println("c==d:" + ((float)c==d)); //작은 타입에서 큰 타입으로 넘어가서 비교하면 안됨
		
	}

}
