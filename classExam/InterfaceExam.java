package classExam;

import interFaceExam.Doggy2;
import interFaceExam.Samoade;

// �������̽��� ���
// ���������� interface Ŭ������ (�������̽���)



public class InterfaceExam {

	public static void main(String[] args) {
		// interface : �߻�ȭ�� ���� ��ü������ ������ �ִ� ����
		//             �ǹ��� ������ ���� ����ϴ� ���
		Doggy2 dog4 = new Samoade("�п���");
		dog4.eat();
		
		System.out.println(dog4.getName());

	}

}
