package exam;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
		// ���α׷������� �Ȱ��� ����� ���� Ƚ�� �ݺ��Ͽ� �����ϵ���
		// �����ϴ� ��ɹ�
		// ���α׷��� ó���ϴ� ��κ��� �ڵ�� �ݺ����� ���°� ����
		// ���� ���� ����ϴ� ���
		// 1. ���
		// 2. do/while��
		// 3. for��
		// 4. Enhanced for��
		
		// �ݺ��� ��¥ �ʿ��ұ�?
		// �ݺ����� ���� ���ʿ��� �۾��� �ּ�ȭ �� �� ����
		
		// while
		// Ư���� ������ �����Ҷ����� ����ؼ� �־��� ��ɹ��� �ݺ� ����.
		
//		while (���ǽ�) {
//			���ǽ��� ����� ���ε��� �ݺ������� �����ϰ��� �ϴ� ��ɹ�.
//		}
		
		// while�� ���� ���ǻ���
		// while���� ������ ���ε��� ��� �����ϴ� �ݺ��� �̱� ������
		// ���� ���������� ��Ȯ���� �ʴٸ� ���� ���� �ݺ�.
		// while�� ���ÿ��� �ݵ�� ���������� �� �޾��־�� �Ѵ�.
		
			
//		int a = 0;
//		while (a < 10) {
//			System.out.println("���� ��� �������̾�~");
//			
//		}
		
		// while���� �������� �ο����1
		// while���� ��Ʈ���� ������ �����ϰ�
		// �� ������ ���� �ݺ����� �������Ѽ� �ᱹ���� false ������
		// ������ �� �ֵ��� ó���Ѵ�.
		
//		int a = 0;
//		while (true) {
//			if (a==10) {
//				
//			}
//			a++;
//			System.out.printf("���� ��� �������̾�~ %d", a);
//			System.out.println();
//			
//		}
		
		// while���� ����
		// ������ �Ϸ����!(Ŀ�� Ÿ����)
		// �Ϸ��� Ŀ�Ǽ����� 5���� �����ϰ� 
		// ���� Ŀ�ǰ� �� �ȸ��� ���α׷��� ����.
		// Ŀ�Ǹ� �� �Ⱦ����� �׳��� ���� ���� ����� ���.
//		Scanner sc = new Scanner(System.in);
//		int coffee = 5;
//		int money = 0;
//		int result = 0;
//		while(coffee > 0) {
//			System.out.println("�մ��� �Խ��ϴ�. Ŀ�Ǹ� �󸶿� �Ľðڽ��ϱ�?");
//			money = sc.nextInt();
//			coffee--;
//			System.out.println("���� Ŀ���� ����"+coffee+"�� �Դϴ�.");
//			result += money;
//			
//		}
//		System.out.printf("���� ���� �ݾ� : %d" , money);
		
		
		// ����) ������ �Է¹޾� 80�� �̻��̸� �հݸ޼�����
		// �׷��� ������ ���հ� �޽����� ����ϴ� �۾��� �ݺ��ϴٰ�
		// 0���� 100�� �̿��� ������ �ԷµǸ� �����ϴ� ���α׷��� �ۼ��غ�����
		
		while (true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է��ϼ���. : ");
			int score = 0;
			score = sc.nextInt();
			
			if ( score < 0 || score > 100)
			{
				break;
			}
			else if (score >= 80)
			{
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			}
			else
			{
				System.out.println("���հ��Դϴ�.");
			}
		}
		
	}

}
