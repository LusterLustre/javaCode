package classExam;

class Test {
	// ��ü�� �Ӽ�(�������)
	public String stuName;
	public int stuID;
	// ��ü�� ���(�޼���)
	// 1. �л��� ������ ���� �޼���
    public void showStudentInfo() {
    	// ������(�Լ���) ������ ǥ���
    	// 1. PascalCase(�Ľ�Į ǥ���)
    	//    - �ܾ���̻��� ���� �빮��ǥ ǥ�������ν� �ܾ ����
    	// 2. camelCase(ī��ǥ���)
    	//    - ù���� ���� �ܾ� ���̻��̸��� �빮�ڷ� ǥ�������ν� �ܾ ����.
    	// 3. snake_case(������ũǥ���(�����/������ھ� ǥ���))
    	//    - �ܾ� ���̻��̸��� _�� ǥ�������ν� �ܾ ����.
    	
    	System.out.println(stuName + stuID);
    	
    }
    
    public String getStudentName() {
    	return stuName;
    }
}



public class Student {
	
	public static void main(String[] args) {
		// ������ �����ص� Test Ŭ������ ��ü�� ����.
		// �ν��Ͻ� : Ŭ������ ���� ������ ��ü
		Test stuLee = new Test();
		// �ν��Ͻ� stuLee�� ������� stuName�� "������" �Ӽ��ο�.
		stuLee.stuName = "������";
		stuLee.stuID = 001;
		
		stuLee.showStudentInfo();
		// 
		Test stu002 = new Test();
	    stu002.stuName = "������";
	    stu002.stuID = 100;
	    
	    stu002.showStudentInfo();
	    
	    System.out.println(stuLee);
	    System.out.println(stu002);
	}

}
