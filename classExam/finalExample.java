package classExam;

class Person {
	//final String nation = "���ѹα�";
	final String nation;
	static final String SSN = "950305-1234567"; // �ֹι�ȣ�� ���������� ����
	String name;
	
	public Person(String nation, String name) {
		this.nation = nation;
		this.name = name;
	}
	
}


public class finalExample {

	public static void main(String[] args) {
		Person p1 = new Person("����Ʈ", "�Ķ��");
		Person p2 = new Person("�ε�", "����");
		
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
