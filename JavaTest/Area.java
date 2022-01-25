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
		
		System.out.println("\n**** 원의 넓이 ****");
		System.out.print("반지름 : ");
		r = sc.nextInt();
		
		area = r * r * PI;
		output();
	}
	
	
	public void triangle() {
		
		int a, b;
		
		System.out.println("\n**** 삼각형의 넓이 ****");
		System.out.print("밑변 : ");
		a = sc.nextInt();
		System.out.print("높이 : ");
		b = sc.nextInt();

		area = (double)a * b / 2;
		output();
	}
	
	
	public void trape() {

		int a, b, c;
		
		System.out.println("\n**** 사다리꼴의 넓이 ****");
		System.out.print("아랫변 : ");
		a = sc.nextInt();
		System.out.print("윗변 : ");
		b = sc.nextInt();
		System.out.print("높이 : ");
		c = sc.nextInt();

		area = (double)(a + b) * c / 2;
		output();
	}
	
	
	public void output() {
		System.out.printf("넓이 : %.2f\n\n", area);
	}
	
	
	public int menu() {
		int s;

		System.out.println("**** 도형선택 ****");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		System.out.println("선택 : ");
		s = sc.nextInt();
		
		switch(s) {
		case 1: triangle();
		break;
		case 2: circle();
		break;
		case 3: trape();
		break;
		case 4: System.out.println("종료되었습니다.");
		}
		return s;
	}
}
