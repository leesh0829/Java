// ex04 패키지에 속하는 StackTest 클래스 정의
package ex04;

// java.util 패키지에 속하는 Random 클래스 임포트
import java.util.Random;

public class StackTest {
    
    // main 메서드: 프로그램의 진입점
    public static void main(String[] args) {
        // Random 클래스의 인스턴스 생성
        Random rand = new Random();
        
        // IStack 인터페이스 타입의 참조변수 f1을 생성하고 FixedStack 객체로 초기화
        IStack f1 = new FixedStack(5);
        
        // --스택에 데이터 입력하기--
        System.out.println("--스택에 데이터 입력하기--");
        
        // 반복문을 사용하여 스택에 무작위 정수 데이터 입력
        for (int i = 0; i < 6; i++)
            f1.push(rand.nextInt(11));
        
        // 줄바꿈 출력
        System.out.println("\n\n-- 스택에서 데이터 출력하기--");
        
        // 반복문을 사용하여 스택에서 데이터 출력
        for (int i = 0; i < 6; i++)
            System.out.print(f1.pop() + " ");
    }
}
