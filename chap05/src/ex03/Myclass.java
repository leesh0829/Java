package ex03;

public class Myclass {
    // ��� ���� rc ���� �� �ʱ�ȭ: RemoteControl Ÿ���� ��ü TV�� �ʱ�ȭ
    RemoteControl rc = new TV();

    // �⺻ ������
    Myclass() {}

    // ������: RemoteControl�� ���ڷ� �޾� �ʱ�ȭ�ϴ� ���
    Myclass(RemoteControl rc) {
        // ������ ȣ�� �� ���޹��� ������(rc)�� ���� �ν��Ͻ��� rc�� ����
        this.rc = rc;
        
        // �������� �Ѱ� ������ 5�� ����
        rc.turnOn();
        rc.setVolume(5);
    }

    // mA �޼���: ���ο� Audio �������� �����Ͽ� �Ѱ� ������ 3���� ����
    void mA() {
        System.out.println("mA() ȣ��");
        
        // ���� ���� rc ���� �� �ʱ�ȭ: Audio Ÿ���� ��ü�� �ʱ�ȭ
        RemoteControl rc = new Audio();
        
        // ���ο� �������� �Ѱ� ������ 3���� ����
        rc.turnOn();
        rc.setVolume(3);
    }

    // mB �޼���: ���� �ν��Ͻ��� rc�� ����Ͽ� �Ѱ� ������ 8�� ����
    void mB() {
        System.out.println("mB(RemoteControl rc) ȣ��");
        
        // ���� �ν��Ͻ��� rc�� ����Ͽ� �Ѱ� ������ 8�� ����
        rc.turnOn();
        rc.setVolume(8);
    }
}
