package ex09;

public class D extends C implements A, B{
	
	@Override
	public void ma() {
		System.out.println("ma() ������");
	}
	
	@Override
	public void mb() {
		System.out.println("mb() ������");
	}
	
	@Override
	public void mc() {
		System.out.println("mc() ������");
	}
	
	public void md() {
		System.out.println("md()");
	}
}
