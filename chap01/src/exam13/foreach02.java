package exam13;

public class foreach02 {

	public static void main(String[] args) {
		int[] a = {1, 5, 3, 8, 2};
		int max = a[0];
		
		for(int v : a)
		{
			if(max < v) max = v;
		}
		
		System.out.printf("배열 항목값 중 최댓 값은 %d이다", max);
	}

}
