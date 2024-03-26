package exam13;

public class Array03 {

	public static void main(String[] args) {
		String[] oldArray = new String[] {"강아지", "고양이", "송아지"};
		String[] newArray = new String[oldArray.length+2];
		
		for(int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
			System.out.println("oldArray[" + i + "] = " + oldArray[i]);
		}
		
		System.out.println("------------------");
		
		for(int i = 0; i < newArray.length; i++)
			System.out.println("newArray[" + i + "] = " + newArray[i]);
	}
}
