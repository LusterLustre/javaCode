package exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �����
		// ���� ��� �ּһ���
		// 1. �ּ� 2�� �̻��� ���ڸ� �Է¹����� (2���� ok)
		// 2. �Է¹��� 2���� ������ ��Ģ������ �����ؾ��Ѵ�.
		
		// 2022/01/13 ������ ���� ����߰�
		// �߰����� : ���꺰 ��� ����
		// - ������ ������ ����ڰ� �Է��ϵ��� ó���ϼ��� (��Ģ����)
		// �����ڰ� +,-,*,/ �̿��� ���ڰ� ������
		// �ش翬���� ������ �� �����ϴ�. ��� �޼����� ����ϼ���.
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Դϴ�. ������ ��ȣ�� �Է����ּ���.");
		char code = in.next().charAt(0);
		System.out.println(code);
		System.out.println("ù��° �� �Է�");
		int a = in.nextInt();
		System.out.println("�ι�° �� �Է�");
		int b = in.nextInt();
		
		switch(code) {
		case '+':
			System.out.println("�����");
			System.out.println("���� : " + (a+b));
			break;
		case '-':
			System.out.println("�����");
			System.out.println("���� : " + (a-b));
			break;
		case '*':
			System.out.println("�����");
			System.out.println("���� : " + (a*b));
			break;
		case '/':
			System.out.println("�����");
			System.out.println("������ : " + (a-b));
			break;
			default:
				System.out.println("�����ȣ�� �߸� �Է��߽��ϴ�.");
		}
		
//		System.out.println("�����");
//		System.out.println("���� : " + (a+b));
//		
//		// ���� ��ɰ��� 1(����)
//		// ���� a�� b���� ������ b-a�� �����ϼ���.
//		System.out.println("���� : " + ((a>b)?(a-b):(b-a)));
//		System.out.println("���� : " + (a*b));
//		// ���� ��ɰ��� 2(����)
//		// ���� a�� b���� ������ b/a�� �����ϼ���.
//		System.out.println("������ : " + ((a>b)?(a/b):(b/a)));
		
		
	}

}
