package classExam;

class Test1 {
	private String name;
	
	Test1 (String name) {
		this.setName(name);
	}
	
	private void mTest() {
		System.out.println("private �׽�Ʈ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}





public class Encapsulation {

	public static void main(String[] args) {
		// ĸ��ȭ
		// ĸ���ȿ� �� ���빰�� ��ȣ�ϰ� ��������� ó���ϴ� ���.
		
		// ĸ��ȭ�� ����
		// �������� -> ���ο��� ����ϴ� Ŭ������ �������� �ʰų�
		//           Ŭ���� ���ο����� ����ϴ� �޼��尡 �ܺο� ������� �ʵ���
		//           ����� ������ ����� ���� �ܺο��� ������ �ʵ��� ��ȣ�ϱ� ����.
		
		Test1 t = new Test1("test");
		System.out.println(t.getName()); //���������ڰ� private�� ��� ȣ���� ����.
	}

}
