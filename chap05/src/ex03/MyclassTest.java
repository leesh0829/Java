package ex03;

public class MyclassTest {

    public static void main(String[] args) {
        // ��ü ����: Myclass Ŭ������ �ν��Ͻ� mc1�� ����
        Myclass mc1 = new Myclass();

        // mc1�� rc ��� ����(������)�� ����Ͽ� turnOn �޼��� ȣ�� �� setVolume �޼��� ȣ��
        mc1.rc.turnOn();
        mc1.rc.setVolume(1);

        System.out.println("-------------");

        // ���ڷ� Audio ��ü�� �޴� �����ڸ� ����Ͽ� Myclass Ŭ������ �ν��Ͻ� mc2�� ����
        Myclass mc2 = new Myclass(new Audio());

        System.out.println("-------------");

        // ��ü ����: Myclass Ŭ������ �ν��Ͻ� mc3�� ����
        Myclass mc3 = new Myclass();

        // mc3�� mA �޼��� ȣ��
        mc3.mA();

        System.out.println("-------------");

        // ��ü ����: Myclass Ŭ������ �ν��Ͻ� mc4�� ����
        Myclass mc4 = new Myclass();

        // mc4�� mB �޼��� ȣ��
        mc4.mB();
    }

}
