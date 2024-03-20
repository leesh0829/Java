package exam44;

public class ComputerTest {

	public static void main(String[] args) {
		Computer com = new Computer(); //객체 생성
		
		int[] array = {1,2,3,4,5};
		
		System.out.println("배열 항목 값의 합: " + com.add(array));
		System.out.println("배열 항목 값의 평균: " + com.ave(array));
		System.out.println("배열 항목 값의 평균: " + com.ave(new int[] {2,3,4,5,6}));
		
		System.out.println("배열 항목 값의 평균: " + com.ave(2,3,4,5,6));
	}

}
