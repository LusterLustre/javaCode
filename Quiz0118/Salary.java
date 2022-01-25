package Quiz0118;

public class Salary {
	
	String name;
	int salary;
	// 필드 : String department (부서)
	// 생성자 : Salary(String n, int s) 를 넘겨받아 name, salary에 대입
	// 메서드 : getInfomation1() 메서드에서 이름과 연봉을 출력

	Salary(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	void getInfomation1() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary + "원");
	}
}
