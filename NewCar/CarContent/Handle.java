package NewCar.CarContent;

public class Handle {
	
	// ��ȸ��
	void left() {
		//��ȸ���� �Ҷ� �����̸� Ű�� ������.
		//�ܼ��� �޼���ó���� �ƴ�
		//�޼��� ȣ���� ���� ó��
		leftLight();
		System.out.println("��ȸ�� �ؿ�!");
		leftLightOff();
		
	}
	
	// ��ȸ�� ������
	void leftLight() {
		System.out.println("���� ������ on");
	}
	
	// ��ȸ�� ������ ����
	void leftLightOff() {
		System.out.println("���� ������ off");
	}
	
	
	// ��ȸ��
	void right() {
		rightLight();
		System.out.println("��ȸ�� �ؿ�!");
		rightLightOff();
	}
	
	// ��ȸ�� ������
	void rightLight() {
		System.out.println("���� ������ on");
	}
		
		// ��ȸ�� ������ ����
	void rightLightOff() {
		System.out.println("���� ������ off");
	}
	
	
	

}
