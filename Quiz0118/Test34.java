package Quiz0118;

public class Test34 extends Salary {
	
	public String department;

	public Test34(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public void getinfomation2() {
		System.out.println("�μ� : " + department);
	}

	public static void main(String[] args) {
		Test34 ob = new Test34("��ö����", 85000000, "ö���");
		ob.getInfomation1();
		ob.getinfomation2();
	}
}
