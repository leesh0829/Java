package exam7;

public class ComputerTestt {

	public static void main(String[] args) {
		
		Computerr com = new Computerr(); //객체 생성
		
		int[] array = {2,4,6,8,9};
		
		System.out.println("배열 항목 값의 합: " + com.add(array));
		System.out.println("배열 항목 값의 평균: " + com.ave(array));
	}
}
