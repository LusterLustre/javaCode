package exam;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// for��
		// �ݺ����� ����, while���� �ٸ���
		// �ݺ��� ���۽� ������ ���������� ������ �����ϴ� ����
		
		// for (�ʱ��; ���ǽ�; ������) {
		//
		// }
		
		// 10�� �� �ȳѾ�� ���� ����.
//		int tree = 0;
//		for (int i=1; i<=10; i++) {
//			System.out.println("������ ������ "+i+"��° ������ϴ�.");
//		}
		
		// while vs do-while vs for
		// ���� ������� ���̸� �����Ѱ�?
		// while : ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� �����Ҷ�
		// do-while : ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� �����Ҷ�
		// for : Ư�� ���� ����, Ƚ���� �����Ͽ� �ݺ��ɶ� ���, �迭�� ������ ����.
		
		// for���� �ʱ��, ���ǽ�, �������� ������ ����.
		// ������ ��Ʈ������ Ǫ�� �����
//		int i=0;
//		for (;;) {
//			i++;
//			System.out.println("������ ������ "+i+"��° ������ϴ�.");
//		}
		
		
		
		//for�� ��� ���� 2
		// 1~10���� ���� ���ϵ� ¦���� ����
//		int result = 0;
//		for (int i=0; i<10; i++) {
//			if (i%2!=0) {
//			result = result + i; // result +=i
//			}
//			if (i%2!=0) {
//				 continue;
//				 
//				}
//			result = result + i;
//			
//		}
//		System.out.println(result);
		
		// for���� ����
		// ������.
		// ������ 3���� ����ϼ���
		// ex) 3 * 1 = 3
		//     3 * 2 = 6
		//     3 * 9 = 27
		
		// 3�� ���
		// 1. 3�̶�� ���ڰ� �ϳ� �����Ǿ���ϰ�
		// 2. 1~9���� �ݺ�.
//		Scanner sc = new Scanner(System.in);
//		
//		int gugu = 3;
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(gugu + "*" + i + "=" + gugu * i);
//			}
		
		
		// for���� ��ø(���� for��)
		// for�� �ȿ� for���� �ѹ� �� ����� �� ����
		// 2�ܺ��� 9�ܱ��� ���� ���
		
		
		for (int i=2; i<10; i++) {
			
			for (int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}// for end
		}// for end
		
		//���� �� �ܸ��� ǥ���غ�����
		// ex) ------2��------
		
		
		
		
		
		
		
		
		
		
		
	}

}
