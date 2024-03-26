package exam13;
//60page 8
public class Array05 {

	public static void main(String[] args) {
		int[] array = new int[4];
		int[] newArray = array;
		
		array[1] = 5;
		array[2] = 13;
		array[3] = 10;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < newArray.length; j++)
				System.out.println("array[" + i + "] = " + array[i] + "newArray[" + j + "] = " + newArray[j]);
		}
		
	}

}
