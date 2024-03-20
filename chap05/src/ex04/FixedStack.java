// ex04 패키지에 속하는 FixedStack 클래스 정의, IStack 인터페이스 구현
package ex04;

public class FixedStack implements IStack {
    // 스택 배열 선언 및 초기화
    int stack[] = {};
    // tos (Top of Stack): 스택의 가장 위의 요소의 인덱스
    int tos = stack.length;

    // 생성자: 주어진 크기의 배열로 스택을 초기화하고 tos를 -1로 설정
    public FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // push 메서드: 스택에 값을 추가하는 메서드
    @Override
    public void push(int a) {
        // 스택이 꽉 찼는지 확인
        if (stack.length - 1 == tos)
            System.out.println("스택이 꽉 찼습니다.");
        else {
            // 스택에 값을 추가하고 tos를 업데이트
            stack[++tos] = a;
            System.out.print(a + " ");
        }
    }

    // pop 메서드: 스택에서 값을 제거하고 반환하는 메서드
    @Override
    public int pop() {
        // 스택이 비어있는지 확인
        if (tos == -1) {
            System.out.println("스택이 비어있습니다.");
            return 0;
        } else {
            // 스택에서 값을 제거하고 tos를 업데이트하여 다음 요소를 가리킴
            return stack[tos--];
        }
    }
}
