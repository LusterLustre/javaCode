package java0121;

class Test0121 {
	public void testMethod() {
		System.out.println("test");
	}
}

public class LambdaMain {
	public static void main(String[] args) {
		//Test0121 test = new Test0121();
		//test.testMethod();
		
		//익명클래스 : 상속받는 클래스를 명시적으로 별도의 Java파일을 통해
		//           클래스를 만드는게 아니라 코드 내부에 이름이 존재하지 않는
		//           클래스를 만드는 것.
		
		//Test0121 클래스를 상속받는 익명의 클래스 생성
		Test0121 test = new Test0121() {
			public void testMethod() {
				System.out.println("오버라이딩");
			}
			public void serve() {
				System.out.println("서브메서드!");
			}
		};
		
		//test.testMethod();
		// 익명클래스의 존재이유?
		// 추상클래스와 인터페이스 관리
		// -> 내용이 가벼울 경우 익명클래스를 이용해서 처리하기도 한다.
		
		People p1 = new People() {
			@Override
			public void sleep() {
				System.out.println("으어 졸려");
				walk();
			}
			
			@Override
			public void eat() {
				
			}
		};
		
		//p1.sleep();
		
		//Operate 인터페이스를 이용해서 람다식 구현.
		
		// 람다 표현식의 사용조건
		// 1. 인터페이스
		// 2. 인터페이스에 하나의 추상 메서드만 선언.
		// 3. 
//		Operate operate = (a, b) -> {
//			return a + b;
//		};
		
		Cal c1 = new Cal(100, 200);
		
		int result = c1.result((a, b) -> {
			return a * b;
		});
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
