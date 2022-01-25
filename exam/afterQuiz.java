package exam;

import java.util.Scanner;

public class afterQuiz {
	
	public static void main(String[] args) {
//
//	전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
//	전화번호가 다음과 같을 경우, 구조대 전화번호는 재호의 전화번호의 접두사입니다.
//
//	구조대 : 119
//	최명우 : 97 674 223
//	김재호 : 11 9552 4421
//	전화번호부에 적힌 전화번호를 담은 배열 tel_list 이 
//	list_of_tel 함수의 매개변수로 주어질 때, 
//	어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 
//	그렇지 않으면 true를 return 하도록 list_of_tel 함수를 작성해주세요.
//
//	제한 사항
//	tel_list 길이는 1 이상 1,000,00 이하입니다.
//	각 전화번호의 길이는 1 이상 20 이하입니다.
//	같은 전화번호가 중복해서 들어있지 않습니다.
//	입출력 예제
//	tel_list							return
//	["119", "97674223", "1195524421"]	false
//	["123","456","789"]					true
//	["12","123","1235","567","88"]		false
//	입출력 예 설명
//	입출력 예 #1
//	앞에서 설명한 예와 같습니다.	
//
//	입출력 예 #2
//	한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.
//
//	입출력 예 #3
//	첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
//	
		Scanner sc = new Scanner(System.in);
		int x, y;
		int result=1;
		System.out.println("x의 값을 입력하세요");
		x = sc.nextInt();
		System.out.println("y의 값을 입력하세요");
		y = sc.nextInt();
		
		for(int i=0; i<y; i++)
		{
			result *= x;
		}
		System.out.println(x + "의 " + y + "제곱은 " + result);
	}
}
