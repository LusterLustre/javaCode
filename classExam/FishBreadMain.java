package classExam;
//클래스생성
class FishBread {
	
	public String fishCode; // 붕어빵번호
	public String inside; // 붕어빵의 속
	public String flourCode; // 밀가루
	
	public void showFish() {
		System.out.println("번호 : " + fishCode + "\n재료 : "
				+ inside + "\n원산지 : " + flourCode);
	}
}

public class FishBreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishBread fi = new FishBread();
		fi.fishCode = "001";
		fi.inside = "팥";
		fi.flourCode = "미국산";
		
		fi.showFish();
		
		System.out.println();
		
		FishBread fi2 = new FishBread();
		fi2.fishCode = "002";
		fi2.inside = "슈크림";
		fi2.flourCode = "중국산";
		
		fi2.showFish();
		
		// AvanteBuild라는 파일을 생성하고
		// NewAvante 라는 클래스를 생성후
		// 다음의 조건을 만족하도록 구성해주세요
		
		// 클래스가 가진 멤버변수
		// 1. 배터리
		// 2. 속도
		// 3. 기름 (기름은 최대 50L)
		
		// 클래스의 메서드
		// speedUp
		// 이 메서드를 호출할때마다 해당 인스턴스의 속도 변수의 값을 증가.
		// showCar
		// 이 메서드 호출시 해당 인스턴스 멤버변수의 정보 확인
		
		
		
		
	}

}
