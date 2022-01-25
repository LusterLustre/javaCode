package classExam;

class Person {
	//final String nation = "대한민국";
	final String nation;
	static final String SSN = "950305-1234567"; // 주민번호를 상수방식으로 선언
	String name;
	
	public Person(String nation, String name) {
		this.nation = nation;
		this.name = name;
	}
	
}


public class finalExample {

	public static void main(String[] args) {
		Person p1 = new Person("이집트", "파라오");
		Person p2 = new Person("인도", "간디");
		
		System.out.println(p2.nation);
		System.out.println(p1.nation);
		//System.out.println(p1.name);
		//System.out.println(p1.ssn);
		
		System.out.println("==================================");
		

		System.out.println(p2.nation);
		//System.out.println(p2.name);
		//System.out.println(p2.ssn);
	}

}
