package Quiz0118;

public class Salary {
	
	String name;
	int salary;
	// �ʵ� : String department (�μ�)
	// ������ : Salary(String n, int s) �� �Ѱܹ޾� name, salary�� ����
	// �޼��� : getInfomation1() �޼��忡�� �̸��� ������ ���

	Salary(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	void getInfomation1() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + salary + "��");
	}
}
