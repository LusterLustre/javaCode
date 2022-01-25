package JavaTest;

import java.util.Random;
import java.util.Scanner; // 스캐너 클래스 호출

public class java_quiz1_김진혁 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		
		int a = (int)(Math.random()*26);
		int num;
		
		Random random = new Random(); // 난수를 생성하기 위해 Random 함수 생성
		System.out.println("*** 난수가 발생하셨습니다. 맞추어보세요 ***");

		int rd = random.nextInt(26-1);

		for(int i=0;; i++) {
			System.out.print("숫자입력 : ");
			num = sc.nextInt();
			if(rd == num) {
				System.out.printf("추카추카 %d번만에 맞추셨습니다.", i);
				System.out.println();
			}else if(rd < num) {
				System.out.println("컴퓨터의 숫자가 더 작습니다");
			}else if(rd > num) {
				System.out.println("컴퓨터의 숫자가 더 큽니다");
			}
		}
		
		
		
		
		
		
	}
	

}
