package ex22;

public class SmartPhone extends Phone{
	
	public SmartPhone( String owner ) {
		super(owner);
	}
	
	public void internet_Search()
	{
		System.out.println("인터넷 검색을 합니다.");
	}
}
