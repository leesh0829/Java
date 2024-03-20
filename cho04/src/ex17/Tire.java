package ex17;

public class Tire {
	public String location; //타이어 위치
	public int max;	//최대 회전수
	public int accum;	//누적 회전수
	
	public Tire(String location, int max) {
		this.location = location; 
		this.max = max;
	}
	
	public boolean roll() { //누적횟수 증가, 펑크 유무 확인후 리턴
		accum++;
		
		if(accum < max)
		{
			System.out.printf("%sTire 수명: %d회\n", location, max - accum);
			return true;
		}
		else 
		{
			System.out.printf("*** %s Tire 펑크 ***\n", location);
			return false;
		}
	}
}
