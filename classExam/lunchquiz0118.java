package classExam;

//1. Phone 클래스를 상속받는 SmartPhone 클래스 생성
class Phone {
	//2. Phone 클래스의 기본 필드는 모델명과 색상
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// - 기능은 전원 키기, 끄기
	public void powerOn() {
		System.out.println("Power ON Hi");
	}
	
	public void powerOff() {
		System.out.println("Power OFF ByeBye");
	}
	// - 벨울리기
	public void bell() {
		System.out.println("Ringdingdong");
	}
	// - 전화하기
	public void call() {
		System.out.println("여보세요 중국집이죠?");
	}
	// - 전화종료하기
	public void hangUp() {
		System.out.println("아 아니네요 ㅈㅅ합니다");
	}
	
}

class SmartPhone extends Phone {
	String browser;
	public SmartPhone(String model, String color, String browser) {
		super(model, color);
		this.browser = browser;
	}
	
	public void webBrowser() {
		System.out.println("인터넷 브라우저 실행");
	}
	
		
	public void kakaoTalk() {
		System.out.println("카카오톡 실행하기");
	}
}

public class lunchquiz0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone("Galaxy", "Black");
		Phone p2 = new SmartPhone("iPhone", "White", "브라우저");
		SmartPhone sp = (SmartPhone)p2;
		System.out.println(p1.model);
		System.out.println(p1.color);
		
		System.out.println("======전화기능======");
		
		p1.powerOn();
		p1.powerOff();
		p1.bell();
		p1.call();
		p1.hangUp();
		
		System.out.println("======스마트폰======");
		
		sp.webBrowser();
		sp.kakaoTalk();
		

	}

}
