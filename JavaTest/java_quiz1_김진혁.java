package JavaTest;

import java.util.Random;
import java.util.Scanner; // ��ĳ�� Ŭ���� ȣ��

public class java_quiz1_������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		int a = (int)(Math.random()*26);
		int num;
		
		Random random = new Random(); // ������ �����ϱ� ���� Random �Լ� ����
		System.out.println("*** ������ �߻��ϼ̽��ϴ�. ���߾���� ***");

		int rd = random.nextInt(26-1);

		for(int i=0;; i++) {
			System.out.print("�����Է� : ");
			num = sc.nextInt();
			if(rd == num) {
				System.out.printf("��ī��ī %d������ ���߼̽��ϴ�.", i);
				System.out.println();
			}else if(rd < num) {
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�");
			}else if(rd > num) {
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�");
			}
		}
		
		
		
		
		
		
	}
	

}
