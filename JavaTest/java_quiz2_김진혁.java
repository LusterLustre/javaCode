package JavaTest;

public class java_quiz2_������ {
	
	public static long return_add(int a, int b) {
		
		int start = 0, end = 0;
        long sum = 0;
        
        // a�� b�� ������ ����
        if (a == b) {
            return a;
        } 
        // a�� b�� ��Ұ��踦 ������ ���� �ʱ� ���ؼ� else if ���ǹ��� 2�� �������
        else if (a < b) {
            start = a;
            end = b;
        } else if (b < a) {
            start = b;
            end = a;	
        }
        
        // a�� b���̿� ���� ��� ������ �� ������ ���
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        
        return sum;
    }
	
	public static void main(String[] args) {
		
		System.out.println(return_add(2, 5));
		System.out.println(return_add(5, 2));
		System.out.println(return_add(2, 2)); // a�� b�� ���� ���� ���� �ƹ� ���� ����
		
		
		
		
	}
}

