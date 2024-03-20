// ex04 패키지에 속하는 IStack 인터페이스 정의
package ex04;

// IStack 인터페이스 선언
public interface IStack {
    // push 메서드 선언: 스택에 정수를 추가하는 추상 메서드
    public abstract void push(int a);

    // pop 메서드 선언: 스택에서 정수를 제거하고 반환하는 추상 메서드
    public abstract int pop();
}
