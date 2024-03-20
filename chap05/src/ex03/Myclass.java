package ex03;

public class Myclass {
    // 멤버 변수 rc 선언 및 초기화: RemoteControl 타입의 객체 TV로 초기화
    RemoteControl rc = new TV();

    // 기본 생성자
    Myclass() {}

    // 생성자: RemoteControl을 인자로 받아 초기화하는 경우
    Myclass(RemoteControl rc) {
        // 생성자 호출 시 전달받은 리모컨(rc)을 현재 인스턴스의 rc로 설정
        this.rc = rc;
        
        // 리모컨을 켜고 볼륨을 5로 설정
        rc.turnOn();
        rc.setVolume(5);
    }

    // mA 메서드: 새로운 Audio 리모컨을 생성하여 켜고 볼륨을 3으로 설정
    void mA() {
        System.out.println("mA() 호출");
        
        // 로컬 변수 rc 선언 및 초기화: Audio 타입의 객체로 초기화
        RemoteControl rc = new Audio();
        
        // 새로운 리모컨을 켜고 볼륨을 3으로 설정
        rc.turnOn();
        rc.setVolume(3);
    }

    // mB 메서드: 현재 인스턴스의 rc를 사용하여 켜고 볼륨을 8로 설정
    void mB() {
        System.out.println("mB(RemoteControl rc) 호출");
        
        // 현재 인스턴스의 rc를 사용하여 켜고 볼륨을 8로 설정
        rc.turnOn();
        rc.setVolume(8);
    }
}
