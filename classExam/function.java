package classExam;

import java.util.Scanner;

public class function {

	public static void sayHi(String hello) {
		System.out.println(hello);
	}
	
	// 1���� �Ѿ�� �Ķ���ͱ����� ���� ����ϴ� �Լ�.
	// 100 -> ��������� 5050;
	
	public static int calSum(int num) {
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//�μ��� ���� ���ϴ� �Լ�.
//		// �μ�(argument)     = ��, ����, ������ �Լ��� ���޵Ǵ� ��
//		// �Ű�����(parameter) = �Լ�, �޼��忡�� ���Ǵ� ���޵� ���� �޴� ����.
//		String hello = "�ȳ��ϼ�";
//		
//		sayHi(hello); //���� hello�� �Լ� sayHi�� ���޵� �μ�.
//		sayHi("�� ����ü �𸣰ڳ� �ФФ�");
//		
		int result=calSum(10);
		System.out.println(result);
		int result2=mulNum(10, 20);
		System.out.println(result2);
		

	}
	
	// ����
	// �Ķ���͸� ���������� 2���� �Է¹޾�
	// �Է¹��� �� ���� ���� ����ϴ�
	// mulNum �Լ��� ����� �ּ���.
	
	
    public static int mulNum(int a, int b) {
    	//return : �Լ��� �����ϰ� ��� ���� ��ȯ�Ҷ� ����ϴ� Ű����
    	return a * b;
    }
}
