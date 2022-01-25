package NewCar.CarContent;

public class Handle {
	
	// 좌회전
	void left() {
		//좌회전을 할때 깜빡이를 키고 끄겠음.
		//단순한 메세지처리가 아닌
		//메서드 호출을 통해 처리
		leftLight();
		System.out.println("좌회전 해요!");
		leftLightOff();
		
	}
	
	// 좌회전 깜빡이
	void leftLight() {
		System.out.println("좌측 깜빡이 on");
	}
	
	// 좌회전 깜빡이 끄기
	void leftLightOff() {
		System.out.println("좌측 깜빡이 off");
	}
	
	
	// 우회전
	void right() {
		rightLight();
		System.out.println("우회전 해요!");
		rightLightOff();
	}
	
	// 좌회전 깜빡이
	void rightLight() {
		System.out.println("우측 깜빡이 on");
	}
		
		// 좌회전 깜빡이 끄기
	void rightLightOff() {
		System.out.println("우측 깜빡이 off");
	}
	
	
	

}
