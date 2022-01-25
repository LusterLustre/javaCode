package classExam;

//1. Phone Ŭ������ ��ӹ޴� SmartPhone Ŭ���� ����
class Phone {
	//2. Phone Ŭ������ �⺻ �ʵ�� �𵨸�� ����
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// - ����� ���� Ű��, ����
	public void powerOn() {
		System.out.println("Power ON Hi");
	}
	
	public void powerOff() {
		System.out.println("Power OFF ByeBye");
	}
	// - ���︮��
	public void bell() {
		System.out.println("Ringdingdong");
	}
	// - ��ȭ�ϱ�
	public void call() {
		System.out.println("�������� �߱�������?");
	}
	// - ��ȭ�����ϱ�
	public void hangUp() {
		System.out.println("�� �ƴϳ׿� �����մϴ�");
	}
	
}

class SmartPhone extends Phone {
	String browser;
	public SmartPhone(String model, String color, String browser) {
		super(model, color);
		this.browser = browser;
	}
	
	public void webBrowser() {
		System.out.println("���ͳ� ������ ����");
	}
	
		
	public void kakaoTalk() {
		System.out.println("īī���� �����ϱ�");
	}
}

public class lunchquiz0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone("Galaxy", "Black");
		Phone p2 = new SmartPhone("iPhone", "White", "������");
		SmartPhone sp = (SmartPhone)p2;
		System.out.println(p1.model);
		System.out.println(p1.color);
		
		System.out.println("======��ȭ���======");
		
		p1.powerOn();
		p1.powerOff();
		p1.bell();
		p1.call();
		p1.hangUp();
		
		System.out.println("======����Ʈ��======");
		
		sp.webBrowser();
		sp.kakaoTalk();
		

	}

}
