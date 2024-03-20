// ex04 ��Ű���� ���ϴ� FixedStack Ŭ���� ����, IStack �������̽� ����
package ex04;

public class FixedStack implements IStack {
    // ���� �迭 ���� �� �ʱ�ȭ
    int stack[] = {};
    // tos (Top of Stack): ������ ���� ���� ����� �ε���
    int tos = stack.length;

    // ������: �־��� ũ���� �迭�� ������ �ʱ�ȭ�ϰ� tos�� -1�� ����
    public FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    // push �޼���: ���ÿ� ���� �߰��ϴ� �޼���
    @Override
    public void push(int a) {
        // ������ �� á���� Ȯ��
        if (stack.length - 1 == tos)
            System.out.println("������ �� á���ϴ�.");
        else {
            // ���ÿ� ���� �߰��ϰ� tos�� ������Ʈ
            stack[++tos] = a;
            System.out.print(a + " ");
        }
    }

    // pop �޼���: ���ÿ��� ���� �����ϰ� ��ȯ�ϴ� �޼���
    @Override
    public int pop() {
        // ������ ����ִ��� Ȯ��
        if (tos == -1) {
            System.out.println("������ ����ֽ��ϴ�.");
            return 0;
        } else {
            // ���ÿ��� ���� �����ϰ� tos�� ������Ʈ�Ͽ� ���� ��Ҹ� ����Ŵ
            return stack[tos--];
        }
    }
}
