package exam;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch��
		// �־��� ���ǰ��� ����� ���� ���α׷��� �ٸ� ����� �����ϵ��� �ϴ� ���ǹ�
		
		// switch���� ����
		// 1. �������� if������ �پ��.
		// 2. �����Ϸ� ���忡�� ����ȭ�� ������ �ӵ��� ������.
		
//		switch (���ǰ�) {
//		case ��1: 
//			���ǿ� �´ٸ� �����ϴ� ��ɹ�;
//			break;
//		default:
//			���ǰ��� ��𿡵� �ش����� ������ �����ϴ� ��ɹ�;
//			break;
//		}
		
		// ���ĺ��� �������� �������� üũ
		// break : �ڵ��� ������ �ߴܽ�Ű�� Ű����.
		// ���� switch case���� break�� ���� �ʴ´ٸ� �� ���� �����ϴ�
		// ��� case ���� default ���� �����ϰ� �ȴ�.
		
//		char c = 'a';
//		
//		switch(c) {
//		case 'a':
//			System.out.println("�ش� ���ڴ� a�Դϴ�.");
//			break;
//		case 'e':
//			System.out.println("�ش� ���ڴ� e�Դϴ�.");
//			break;
//		case 'i':
//			System.out.println("�ش� ���ڴ� i�Դϴ�.");
//			break;
//		case 'o':
//			System.out.println("�ش� ���ڴ� o�Դϴ�.");
//			break;
//		case 'u':
//			System.out.println("�ش� ���ڴ� u�Դϴ�.");
//			break;
//		default:
//			System.out.println("���� Ȥ�� �빮���Դϴ�.");
//			break;
//		}
		
//		char c = 'U';
//		// ��ҹ��ڱ��� �����ϴ� ���� ���� �Ǵ� ���α׷�
//		switch(c) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.printf("�ش� ���ڴ� %c�Դϴ�.", c);
//			break;
//		case 'A':
//		case 'E':
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.printf("�ش� ���ڴ� %c�Դϴ�.", c);
//			break;
//		default:
//			System.out.println("���� Ȥ�� �빮���Դϴ�.");
//			break;
//		}
		// switch~case���� if���� ���� ������ �������̴�.
		// ������ �������δ� 
		// 1. �������� �� �� �ִ� ���� ���� ������ �������̴�.
		// 2. 
		
		// �ݶ� ���Ǳ� �����
		// �ݾ��� �Է¹ް� �ݾ׿� ���� ����� ���.
		// �ݶ��� ���ݺ��� �Է��� �ݾ��� ���ٸ�
		// �ܾ��� �����Ͽ� �ݶ� ������ �����ϴ�. ��� �޼����� ���,
		// �� �ܿ��� �ݶ� �̰� ���� �ܾ��� ����ϵ�
		// ������ �ݾװ� ������ ���ٸ� �ܾ��� �����ϴٸ� �߰��� ����ϼ���
		// �ݶ��� ������ 1000�� �Դϴ�.
		
		// �������� �ۼ��ߴ� ���� ���α׷��� ������ ������ �߰����ּ���
		// - ������ ������ ����ڰ� �Է��ϵ��� ó���ϼ��� (��Ģ����)
		// �����ڰ� +,-,*,/ �̿��� ���ڰ� ������
		// �ش翬���� ������ �� �����ϴ�. ��� �޼����� ����ϼ���.
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		int cola = 1000;
		
		System.out.println("�ݾ��� �Է����ּ���.");
		money = sc.nextInt();
		
		if (money<cola) {
			System.out.println("�ܾ��� �����Ͽ� �ݶ� ���� �� �����ϴ�.");
		}
		else if (money==cola) {
			System.out.println("�ܾ��� �����ϴ�.");
		}
		else if (money>cola) {
			System.out.println("�ܾ��� "+ (money-cola) + "�� ���ҽ��ϴ�.");
		}
		
		
		
	}
}
	
