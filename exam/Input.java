package exam;

import java.io.*;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// ���ݱ��� �����͸� ����Ϸ���?
		// ������ �Է¹޾� �ش� ������ ���뿡�� ó��
		// ������ Scanner Ŭ������ �̿��ؼ� ���α׷� ����ڷκ��� �����͸�
		// �Է¹޴� �͵� �����ϴ�.
		
		// Scanner �޼��� ����
		// boolean : nextBoolean()
		// byte : nextByte()
		// short : nextShort()
		// int : nextInt()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// String : next(), nextLine()
		
		
		// �����͸� �Է¹ޱ����� Scanner ��ü ����
		Scanner in = new Scanner(System.in);
		
		// next, nextline �޼��带 �̿��ؼ� ����ڷκ��� �����͸� �Է¹���
		// next() : ������������ ���ڸ� �Է¹���
		// nextLine() : �Է��� ���� ��ü�� �Է¹���(����[enter]�� �������� ó��)
		//String test2 = in.nextLine();
		
		// ���� �Է�
		System.out.println("�μ��� ���� ����ϴ� ���α׷��Դϴ�.");
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		int num = in.nextInt();
		System.out.println("�Է¹��� ���� : ");
		int num2 = in.nextInt();
		
		//System.out.println(test2);
		
	}

}
