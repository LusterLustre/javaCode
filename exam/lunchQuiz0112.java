package exam;

import java.util.Scanner;

public class lunchQuiz0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//�̸�, ����, Ű(�Ҽ��� ����1�ڸ�����), ��ȭ��ȣ, ������
		
		System.out.println("�������� �Է� ���α׷��Դϴ�.");
		System.out.println("������� �̸��� �Է����ּ���.");
		String name = sc.nextLine();
		System.out.println("������� ���̸� �Է����ּ���.");
		int age = sc.nextInt();
		System.out.println("������� Ű�� �Է����ּ���.");
		float height = sc.nextFloat();
		System.out.println("������� ��ȭ��ȣ�� �Է����ּ���.");
		String phone = sc.next();
		System.out.println("������� �����Ը� �Է����ּ���.");
		float weight = sc.nextFloat();
		
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + height);
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println("������ : " + weight);
		
		
	}

}
