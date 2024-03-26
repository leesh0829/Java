//56page 4
package exam13;

public class Array01 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3}, {4,5}, {6,7,8,9}};
		//int[][] a = new int[3][];
		//a[0] = new int[]{1,2,3};
		//a[1] = new int[]{4,5};
		//a[2] = new int[]{6,7,8,9};
		
		System.out.println("a의 배열 길이:" + a.length);
		System.out.println("a[0]의 배열 길이" + a[0].length);
		System.out.println("a[1]의 배열 길이" + a[1].length);
		System.out.println("a[2]의 배열 길이" + a[2].length);
		
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++)
				System.out.printf("a[%d][%d] = %d\n", i, j, a[i][j]);
	}

}
