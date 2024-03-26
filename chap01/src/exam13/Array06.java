package exam13;
//64page 13
import java.util.Scanner;
//import java.util.Random;

public class Array06 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      Random rand = new Random();

        // 4x3 행렬 입력 받기
        int[][] matrix1 = new int[4][3];
        //System.out.println("4x3 행렬의 요소를 입력하세요:");
        System.out.println("4x3 행렬");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
            	System.out.printf("a[%d][%d] = ", i, j);
                matrix1[i][j] = scanner.nextInt();
//            	matrix1[i][j] = 1+rand.nextInt(9);
//            	System.out.printf("a[%d][%d] = %d\n", i, j, matrix1[i][j]);
            }
        }

        // 3x4 행렬 입력 받기
        int[][] matrix2 = new int[3][4];
        //System.out.println("3x4 행렬의 요소를 입력하세요:");
        System.out.println("3x4 행렬");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
            	System.out.printf("b[%d][%d] = ", i, j);
                matrix2[i][j] = scanner.nextInt();
//            	matrix2[i][j] = 1+rand.nextInt(9);
//            	System.out.printf("b[%d][%d] = %d\n", i, j, matrix2[i][j]);
            	
            }
        }

        // 행렬 곱셈 결과 계산
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // 결과 출력
        System.out.println("행렬 곱셈 결과:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}
}