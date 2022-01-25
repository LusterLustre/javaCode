package java0121;

class Test0121 {
	public void testMethod() {
		System.out.println("test");
	}
}

public class LambdaMain {
	public static void main(String[] args) {
		//Test0121 test = new Test0121();
		//test.testMethod();
		
		//�͸�Ŭ���� : ��ӹ޴� Ŭ������ ��������� ������ Java������ ����
		//           Ŭ������ ����°� �ƴ϶� �ڵ� ���ο� �̸��� �������� �ʴ�
		//           Ŭ������ ����� ��.
		
		//Test0121 Ŭ������ ��ӹ޴� �͸��� Ŭ���� ����
		Test0121 test = new Test0121() {
			public void testMethod() {
				System.out.println("�������̵�");
			}
			public void serve() {
				System.out.println("����޼���!");
			}
		};
		
		//test.testMethod();
		// �͸�Ŭ������ ��������?
		// �߻�Ŭ������ �������̽� ����
		// -> ������ ������ ��� �͸�Ŭ������ �̿��ؼ� ó���ϱ⵵ �Ѵ�.
		
		People p1 = new People() {
			@Override
			public void sleep() {
				System.out.println("���� ����");
				walk();
			}
			
			@Override
			public void eat() {
				
			}
		};
		
		//p1.sleep();
		
		//Operate �������̽��� �̿��ؼ� ���ٽ� ����.
		
		// ���� ǥ������ �������
		// 1. �������̽�
		// 2. �������̽��� �ϳ��� �߻� �޼��常 ����.
		// 3. 
//		Operate operate = (a, b) -> {
//			return a + b;
//		};
		
		Cal c1 = new Cal(100, 200);
		
		int result = c1.result((a, b) -> {
			return a * b;
		});
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
