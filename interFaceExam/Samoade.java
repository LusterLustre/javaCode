package interFaceExam;

//implements�� ���߻���� ��ü�� �� ����
public class Samoade implements Doggy2 {
	
	String name;
	
	public Samoade(String name) {
		//�������̽��� super Ű���尡 �ʼ��� �ƴϴ�.
		this.name = name;
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("�п�");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("zzzzzzZZZZZZ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�ͱ��ͱ�");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
