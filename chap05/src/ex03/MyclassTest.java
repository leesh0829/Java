package ex03;

public class MyclassTest {

    public static void main(String[] args) {
        // 객체 생성: Myclass 클래스의 인스턴스 mc1을 생성
        Myclass mc1 = new Myclass();

        // mc1의 rc 멤버 변수(리모컨)를 사용하여 turnOn 메서드 호출 및 setVolume 메서드 호출
        mc1.rc.turnOn();
        mc1.rc.setVolume(1);

        System.out.println("-------------");

        // 인자로 Audio 객체를 받는 생성자를 사용하여 Myclass 클래스의 인스턴스 mc2를 생성
        Myclass mc2 = new Myclass(new Audio());

        System.out.println("-------------");

        // 객체 생성: Myclass 클래스의 인스턴스 mc3를 생성
        Myclass mc3 = new Myclass();

        // mc3의 mA 메서드 호출
        mc3.mA();

        System.out.println("-------------");

        // 객체 생성: Myclass 클래스의 인스턴스 mc4를 생성
        Myclass mc4 = new Myclass();

        // mc4의 mB 메서드 호출
        mc4.mB();
    }

}
