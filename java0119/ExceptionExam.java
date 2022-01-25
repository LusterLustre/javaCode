package java0119;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외 : 프로그램 실행중 발생하는 예기치 못한 상황
		// 자바에서 모든 에러, 예외는 Throwable 클래스를 통해 처리
		// Throwable 클래스를 직접 이용할 일은 극히 드물다.
		
		// 자주볼 수 있는 예외 종류
		// 1. OutOfMemoryError
		//  - 자바 가상머신 메모리가 부족하여 인스턴스 할당이 불가능하고
		//    가비지 컬렉터가 메모리를 사용할 수 없을때 발생.
		
		// Exception
		// 프로그램 실행중 종료될 수 있는 문제와 연관되어 예외처리를 선택적으로
		// 진행하거나 꼭 해야하나는 클래스들의 슈퍼 클래스()
		// Exception에는 Checked Exception과 Unchecked Exception이 있고
		// Checked Exception에서는 반드시 예외처리를 해야 컴파일이 가능하다.
		
		// Checked Exception - 직접적으로 Exception 클래스를 상속받는 경우.
		// UnChecked Exception - RuntimeException 클래스를 상속받는 경우.
		
		// Checked Exception - try catch 구문을 사용해서 작성.
		
		
//		try {
//			예외, 에러가 발생하지 않을 경우 실행될 코드
//		}catch(Exception e) {
//			try 블럭안에서 예외가 발생시 실행될 코드.
//		}
		
		
		// 예외처리가 컨트롤 할 수 없는 에러
		// Syntax Error
		
		// 예외의 종류
		// Checked Exception
		// 1. IOException
		// 입출력과 관련된 예외
		// 2. InterruptedException
		// 스레드 관련 예외
		
		// Unchecked Exception
		// 1. RuntimeException
		// Exception 클래스를 직접 상속 받을 수 있음
		// RuntimeException -> 이 클래스를 상속받으면 try-catch를 강제로
		// 선언하지 않아도 된다.
		
		// 2. NullPointerException
		// 자료형 변수에 인스턴스가 저장되어 있지 않고 null이 있다면
		// 인스턴스 메서드 호출, 변수 접근시 발생하는 예외
//		String text = null;
//		System.out.println(text.isEmpty());

		// 3. ClassCastException
		// 객체 타입 변환시 올바르지 않은 객체로 타입변환할 경우 발생하는 에러
		
		// 예외 발생 확인법
//		int num = -1;
//		int[] array = new int[3];
//		System.out.println(array[num]);
//		try {
//			System.out.println(array[num]);
//		} catch(Exception e) {
//			System.out.println("에러 났을때 나오는 메세지!");
//			e.printStackTrace();
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a=0;
//		while(a<2) {
//			try {
//				int value = sc.nextInt();
//			} catch (InputMismatchException ex) {
//				System.out.println("문자를 입력했습니다 다시 입력해주세요.");
//			}
//			a+=1;
//		}
				
		// 예외처리시 고려해야할 사항
		// 모든 예외를 체크하는 것은 힘들다.
		
		// 하지만 예외가 발생할 가능성이 높다고 생각된다면
		// RuntimeException 클래스를 통해 예외에 대응하는 방법이 있음.
		//  -> 하지만 가급적이면 예외 종류별로 적절한 Exception을 찾는 것이 제일 좋다.
		
		// 커스텀 예외 throw
//		ExceptionTest ext = new ExceptionTest();
//		ext.setName("test");
		
		//자바에서 나누기 0을 하면 어떻게 될까?
		//System.out.println(4/0);
		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			int firDiv;
//			int secDiv;
//			
//			try {
//			System.out.println("피제수(나눠버릴)를 입력해주세요");
//			firDiv = sc.nextInt();
//			System.out.println("제수(나눌숫자)를 입력해주세요");
//			secDiv = sc.nextInt();
//			int result = firDiv / secDiv;
//			System.out.printf("%d / %d = %d\n", firDiv, secDiv, result);
//			}
//			catch (ArithmeticException e) {
//				System.out.println("0으로 나누지 마세요!");
//				continue;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
