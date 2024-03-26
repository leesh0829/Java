package exam12;

public class Array01 {

	public static void main(String[] args) {
		
		//배열 만드는 첫번 째 방법: 배열에 들어갈 항목값을 알고있는 경우 {1, 2, 3}
		//int[] a = {1, 2, 3};
		//a[0] = 4;
		
		//배열 만드는 두번 째 방법: 항목을 모를경우
		int[] a = new int[6]; //0 //0~5번까지 저장
		//String[] a = new String[5]; //null
		//double[] a = new double[5]; //0.0
		//boolean[] a = new boolean[5]; //false
		//char[] a = new char[5]; //
		
		a[0] = 95;
		a[2] = 80;
		//a[7] = 90; //5번 까지 저장했지만 7번은 인덱스 지정을 하지 않아서
		a[5] = 90;
		
		//a = null;     //null을 입력하면, 배열을 참조하고 있지 않습니다
		
		//System.out.println("a[0] = " + a[0]);
		//System.out.println("a[1] = " + a[1]);
		//System.out.println("a[2] = " + a[2]);
		
		//배열 만드는 세 번째 방법   //배열 선언 후 항목 값을 이용하여 배열 만들기
		//int [] a;
		// a = {1, 2, 3, 4, 5}    // {1, 2, 3, 4, 5}
		a = new int[] {1, 2, 3, 4, 5};
		//a = new int[5] {1, 2, 3, 4, 5}; //[]안에 인덱스 칸 입력 금지
		
		for(int i = 0; i < 6; i++) {	
			System.out.printf("a[%d] = %d \n", i, a[i]);
		}
		
	}

}
