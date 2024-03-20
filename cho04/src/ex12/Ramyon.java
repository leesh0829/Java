package ex12;

public class Ramyon { //필드 접근제한자는 default로 정적으로 선언
	String ramyon = "라면";
	String water = "물";
	String onion = "파";
	
	static void boilwater()
	{
		System.out.println("물을 끓인다.");
	}
	
	static void cooking()
	{
		System.out.println("라면과 파를 넣고 끓인다.");
	}
	
	static void eating()
	{
		System.out.println("라면을 맛있게 호로록~");
	}
}
