package exam01;

public class Test02 {

	public static void main(String[] args) {
		/*int x;
		int y = 30;
		int sum = x + y; // 초기화 된 변수는 사용 불가능
		x = 30; */
		
//		int sum;
//		int x = 0;
//		int y = 20;
//		sum = x + y;
		
		int hour = 5;
		int min = 30;
		int result = (hour * 60) + min;
		System.out.println("hour = " + hour + "시간");
		System.out.println("min = " + min + "분");
		System.out.println("totalMinute = " + result + "분");
	}

}
