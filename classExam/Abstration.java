package classExam;

//����� ���̺� �ɾ� ���� �Դ� ���� �ڵ��
//public class People {
//	
//	private final Table table;
//	private final Spoon spoon;
//	private final Rice rice;
//	
//	public People(Table table, Spoon spoon, Rice rice) {
//		this.table = table;
//		this.spoon = spoon;
//		this.rice = rice;
//	}
//	
//	public void eat() {
//		table.seat();
//		spoon.taken();
//		spoon.scoop(rice);
//		rice.eaten();
//	}
//}

// abstract Ŭ���� : �߻�Ŭ����
// �߻�ȭ�� ���� ��ü���� �����ִ� Ű����
abstract class Doggy {
	// �ʵ� : ����
	public String color;
	
	public Doggy(String color) {
		this.color = color;
	}
	
	
	// �߻�޼���
	// �߻� �޼��� : �޼��� ��, ����Ÿ��, �Ķ���͸� �����ϰ� ������ �������� ����.
	// �������Ǵ� ���� Ŭ�������� �������Ͽ� ���.
	// ������ ���ؼ� �̸� ���� �ڱ�
	public abstract void bite();
	public abstract void eat();
	public void bark() {
		System.out.println("�п�");
	}
	
}

class Huskey extends Doggy {
	
	public Huskey (String color) {
		super(color);
	}
	
	@Override
	public void bite() {
		
	}
	
	@Override
	public void eat() {
		
	}
}

class Sibadog extends Doggy {
	public Sibadog(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("���ġ��!");
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}



public class Abstration {

	public static void main(String[] args) {
		// �߻�ȭ : ���뺸�� �ٽ����� ������ �߷����� ��
		// 1. �ٽ����ΰ��� �߷�����.
		// 2. �߷����͵��� �����Ų��.
		// 3. How���� what�� ��Ŀ���� �д�.
		
		// ex)���� �Դ´�
		// ���� �Դ´� ��� �ൿ�� ������ �ൿ��
		// - ��Ź�� �ɱ� (���� ��Ź����?)
		//    �ö�ƽ ��Ź?, ö��Ź?, ������Ź?
		// - ������ ��� (���� ����������?)
		//    �ݼ���? ������? �ö�ƽ?
		// - ��Ǫ�� (����������?)
		//    �ҹ�? ��̹�?
		// - ���� ������ ��������
		//    
		
		Huskey dog1 = new Huskey("����");
		dog1.bark();
		
		Sibadog dog2 = new Sibadog("����");
		dog2.eat();
				
		Doggy dog3 = new Huskey("���");
		dog3.bite();
	}

}
