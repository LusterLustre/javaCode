package classExam;

class Dog {
	public String color;
	
	public void bite() {
		System.out.println("������");
	}
	
	public void eat() {
		System.out.println("��Ա�");
	}
	
	public void bark() {
		System.out.println("�������п�");
	}
	
}

class Biggle extends Dog {
	
}

class GoldenRetriever extends Dog {
	public void swim() {
		System.out.println("���ġ��!");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		//GoldenRetriver d2 = new GoldenRetriver();
		
		//�Ʒ��� �ڵ�� ���� ��Ʈ������ ��� ����ϴ� �Ͱ� ����
		//GoldenRetriever d2 = (GoldenRetriever)d1;
		
		//����� ���ٶ�� ����ϴ°Ͱ� ����.
		// ��ü�� ����ȯ
		Dog dd = new Biggle();
		Biggle v1 = (Biggle)dd;
		
		
		// ��Ʈ������ ����
		// ���� ��Ʈ������
		
		
		
		// ������
		// ��ü���� ����� Ư���� �ϳ�
		// �������� ���¿� ���� �� �ִ� �����̶� ������
		// �ϳ��� ��ü �ν��Ͻ��� �������� �ڷ����� ���� �� �ִ� ��.
		
		// is-a
		// 1. ��Ҵ� ��ü�̴�
		// 2. ��𿡵�� ����
		// 3. �ڸ��� ������ ����̴�.
		// 4. ���α׷��� ���� JAVA��.
		
		// ����
		// �θ� Ŭ���� Dog�� ��ӹ޴�
		// Biggle Ŭ������ GoldenRetriver Ŭ������ �����Ͻð�
		// ���� GoldenRetriver Ŭ������ ������ �Ҽ� �ִ� �����ϰ� 
		// swim �޼��带 �߰��ϼ���
		
		// Dog Ŭ������ �⺻���
		// �ʵ� : ����
		// �⺻ �ൿ : ������, ��Ա�, ¢��
		
		
		
		// instanceof ������
		// �ش� �ν��Ͻ��� Ư�� Ŭ������ �ν��Ͻ����� Ȯ���ϴ� ������.
		// (������ or �ν��Ͻ���) instanceof (Ŭ������)
		Dog dog = new GoldenRetriever();
		
		System.out.println(dog instanceof GoldenRetriever);
		System.out.println(dog instanceof Dog);
		System.out.println(dog instanceof Biggle);
	}

}
