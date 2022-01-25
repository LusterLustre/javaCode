package classExam;

class OverLoadingTest {
	
	int add(int a, int b) {
		return a + b;
	}
	// 1. �Ķ������ ������ �ٸ� ���
	int add(int a, int b, int c) {
		return a + b + c;
	}
	// 2. Ÿ���� �ٸ� ���
	double add(double a, double b) {
		return a + b;
	}
	int add(int[] a) {
		// �Ѿ�� ������ ��
		int result = 0;
		for (int i=0; i < a.length; i++ ) {
			result += a[i];
		}
		return result;
	}
}





public class overLoadingExam {
	

	public static void main(String[] args) {
		OverLoadingTest ov = new OverLoadingTest();
		
		System.out.println(ov.add(10, 20));
		System.out.println(ov.add(20, 40L));
		System.out.println(ov.add(1.5, 20.8));
		System.out.println(ov.add(10, 20, 30));
		
		int[] test = {300,350,400};
		System.out.println(ov.add(test));
		
		// �޼��� �����ε�
		// �� Ŭ���� ���� �̹� ����Ϸ��� �̸��� ���� �̸��� ���� �޼��尡 �ִ���
		// �Ķ������ ������ Ÿ���� �ٸ���, ���� �̸��� ����ؼ� �޼��带 ������ �� �ִ�.
		// �̰��� �޼��� �����ε��̶�� �Ѵ�.
		// ��������, �ٸ����� (����ؼ�)
		
		// �����ε��� �� �ʿ��Ѱɱ�?
		// �Ķ���� ���� �پ��ϰ� �޾Ƽ� ó���ϱ� ���ؼ�.
		
		// �����ε��� ����
		// 1. �޼������ ���ƾ��Ѵ�.
		// 2. �Ķ������ ����, Ÿ���� �޶���Ѵ�.
		// 3. �Ķ���ʹ� ������ ����Ÿ���� �ٸ� ���� �����ε��� �ƴϴ�.
		// 4. �����ε��� �޼������ �Ķ���ͷθ� �����ɼ� �ִ�.
		
		
		
		
		
	}

}
