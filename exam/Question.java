package exam;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		
		//�̸� �Է�
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.nextLine();
		System.out.println("�̸�: " + name);
		
		//���� �Է�
		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt();
		System.out.println("����: " + age + "��");
		
		
		//Ű �Է�
		System.out.println("Ű�� �Է����ּ���.");
		int stature = sc.nextInt();
		System.out.println("Ű: " + stature + "cm");
		
		//��ȭ��ȣ �Է�
		System.out.println("��ȭ��ȣ�� �Է����ּ���.");
		String pn = sc.nextLine();
		System.out.println("��ȭ��ȣ :" + pn);
		
		//������ �Է�
		System.out.println("�����Ը� �Է����ּ���.");
		int weight = sc.nextInt();
		System.out.println("������ :" + weight + "kg");
		
		
	}

}
