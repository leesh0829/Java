// ex04 ��Ű���� ���ϴ� StackTest Ŭ���� ����
package ex04;

// java.util ��Ű���� ���ϴ� Random Ŭ���� ����Ʈ
import java.util.Random;

public class StackTest {
    
    // main �޼���: ���α׷��� ������
    public static void main(String[] args) {
        // Random Ŭ������ �ν��Ͻ� ����
        Random rand = new Random();
        
        // IStack �������̽� Ÿ���� �������� f1�� �����ϰ� FixedStack ��ü�� �ʱ�ȭ
        IStack f1 = new FixedStack(5);
        
        // --���ÿ� ������ �Է��ϱ�--
        System.out.println("--���ÿ� ������ �Է��ϱ�--");
        
        // �ݺ����� ����Ͽ� ���ÿ� ������ ���� ������ �Է�
        for (int i = 0; i < 6; i++)
            f1.push(rand.nextInt(11));
        
        // �ٹٲ� ���
        System.out.println("\n\n-- ���ÿ��� ������ ����ϱ�--");
        
        // �ݺ����� ����Ͽ� ���ÿ��� ������ ���
        for (int i = 0; i < 6; i++)
            System.out.print(f1.pop() + " ");
    }
}
