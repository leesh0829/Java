package ex17;

public class KumboTire extends Tire{	//Tire 상속
	public KumboTire(String l, int m)	//부모 클래스의 Tire메소드 집어넣는 super함수
	{
		super(l, m);
	}
	
	public boolean roll()	//상속 클래스 roll메소드와 비슷하게 이름만 바꿔서 작성
	{
		accum++;
		
		if(accum < max)
		{
			System.out.printf("%sKumhoTire 수명: %d회\n", location, max - accum);
			return true;
		}
		else 
		{
			System.out.printf("*** %sKumhoTire 펑크 ***\n", location);
			return false;
		}
	}
}
