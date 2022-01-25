package Quiz0118;

public class Test34 extends Salary {
	
	public String department;

	public Test34(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public void getinfomation2() {
		System.out.println("∫Œº≠ : " + department);
	}

	public static void main(String[] args) {
		Test34 ob = new Test34("æﬂ√∂¥Î¿Â", 85000000, "√∂±‚πÊ");
		ob.getInfomation1();
		ob.getinfomation2();
	}
}
