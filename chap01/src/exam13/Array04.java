package exam13;
//59page 7
public class Array04 {

	public static void main(String[] args) {
		String[] oldArray = new String[] {"자바", "파이썬", "C언어"};
		String[] newArray = new String[oldArray.length+3];
		
		System.arraycopy(oldArray, 0, newArray, 1, 2);
		
		for(int i = 0; i < oldArray.length; i++)
			System.out.println("oldArray[" + i + "] = " + oldArray[i]);
		
		System.out.println("------------------");
		
		for(int i = 0; i < newArray.length; i++)
			System.out.println("newArray[" + i + "] = " + newArray[i]);
	}

}
