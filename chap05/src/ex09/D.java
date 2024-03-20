package ex09;

public class D extends C implements A, B{
	
	@Override
	public void ma() {
		System.out.println("ma() 재정의");
	}
	
	@Override
	public void mb() {
		System.out.println("mb() 재정의");
	}
	
	@Override
	public void mc() {
		System.out.println("mc() 재정의");
	}
	
	public void md() {
		System.out.println("md()");
	}
}
