package interFaceExam;

//implements는 다중상속을 대체할 수 있음
public class Samoade implements Doggy2 {
	
	String name;
	
	public Samoade(String name) {
		//인터페이스는 super 키워드가 필수가 아니다.
		this.name = name;
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("왈왈");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("zzzzzzZZZZZZ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("와구와구");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
