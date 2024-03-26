package exam13;
//63page 12
public class Foreah04 {

	public static void main(String[] args) {
		int[][] a = {{95, 86}, {83, 92, 96}, {78,83,93,87,88}};
		
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				sum += a[i][j];
				count++;
			}
		}
		
		System.out.printf("sum = %d\n", sum);
		System.out.printf("ЦђБе = %.2f", (float)sum/count);
		
	}

}
