package NewCar.CarContent;

public class Engine {
	
	String name;


	// 시동이 걸렸는지 유무를 체크하는 필드 생성
	boolean isStarted = false;
	
	// 생성자
	Engine(String carName) {
		this.name = carName;
	}
	
	
	// 시동걸기
	// isStarted 필드를 이용해서
	// 
	void start() {
		if (isStarted) {
			System.out.println(String.format("%s는 이미 시동이 걸려있음", name));
			return;
		}
		isStarted = true;
		System.out.println("부릉부릉!");
	}
	
	// 시동끄기
	void off() {
		if (!isStarted) {
			System.out.println(String.format("%s는 이미 시동이 꺼져있음", name));
			return;
		}
		isStarted = false;
		System.out.println("시동 off");
	}
	
	
	
	

}
