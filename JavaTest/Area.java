package JavaTest;

import java.util.Scanner;

class Area {
	Scanner sc = new Scanner(System.in);
	double area;
	final double PI = 3.141592;
	
	
	public Area() {
		this.area = 0;
	}
	
	
	public void circle() {
		
		int r;
		
		System.out.println("\n**** ���� ���� ****");
		System.out.print("������ : ");
		r = sc.nextInt();
		
		area = r * r * PI;
		output();
	}
	
	
	public void triangle() {
		
		int a, b;
		
		System.out.println("\n**** �ﰢ���� ���� ****");
		System.out.print("�غ� : ");
		a = sc.nextInt();
		System.out.print("���� : ");
		b = sc.nextInt();

		area = (double)a * b / 2;
		output();
	}
	
	
	public void trape() {

		int a, b, c;
		
		System.out.println("\n**** ��ٸ����� ���� ****");
		System.out.print("�Ʒ��� : ");
		a = sc.nextInt();
		System.out.print("���� : ");
		b = sc.nextInt();
		System.out.print("���� : ");
		c = sc.nextInt();

		area = (double)(a + b) * c / 2;
		output();
	}
	
	
	public void output() {
		System.out.printf("���� : %.2f\n\n", area);
	}
	
	
	public int menu() {
		int s;

		System.out.println("**** �������� ****");
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.println("4. ����");
		System.out.println("���� : ");
		s = sc.nextInt();
		
		switch(s) {
		case 1: triangle();
		break;
		case 2: circle();
		break;
		case 3: trape();
		break;
		case 4: System.out.println("����Ǿ����ϴ�.");
		}
		return s;
	}
}
