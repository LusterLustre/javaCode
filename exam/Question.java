package exam;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		
		//이름 입력
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("이름: " + name);
		
		//나이 입력
		System.out.println("나이를 입력해주세요.");
		int age = sc.nextInt();
		System.out.println("나이: " + age + "세");
		
		
		//키 입력
		System.out.println("키를 입력해주세요.");
		int stature = sc.nextInt();
		System.out.println("키: " + stature + "cm");
		
		//전화번호 입력
		System.out.println("전화번호를 입력해주세요.");
		String pn = sc.nextLine();
		System.out.println("전화번호 :" + pn);
		
		//몸무게 입력
		System.out.println("몸무게를 입력해주세요.");
		int weight = sc.nextInt();
		System.out.println("몸무게 :" + weight + "kg");
		
		
	}

}
