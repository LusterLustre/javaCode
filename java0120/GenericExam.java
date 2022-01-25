package java0120;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

class GenericTest<T> {
	// T�� ��üŸ�Ը� �����ؼ� Integer Ŭ������ ����ؾ� �������� ���� �� ����.
	// T�� �ν��Ͻ� ������ ���ֵȴ�
	// -> static���� ���Ұ�.
	// ���׸� �迭������ �Ұ���
	// new, instanceOf �����ڴ� T�� �ǿ����ڷ� ���Ұ�.
	T item;
	
	// ���׸� �޼���
	// �޼����� �Ķ����, Ȥ�� ���Ͽ� ���׸��� ���ɼ��� ����.
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
	
	
	// <?> -> ���ϵ� ī��
	// ?�� �̿��ؼ� Ÿ���� ���� �����Ӱ� ����Ҽ� ������
	// �����ε��� ������� �ʴ´�.
	// ? : object
	
	public <T> List<Character> convert(GenericTest<T> gen) {
		ArrayList<Character> list = new ArrayList<>();
		
		String ch = String.valueOf(gen.getItem());
		int size = ch.length();
		for (int i=0; i<ch.length(); i++) {
			list.add(ch.charAt(i));
		}
		return list;
	}
	
	public <T> void print(GenericTest<?> t) {
		System.out.println();
	}
}

public class GenericExam {

	public static void main(String[] args) {
		
		GenericTest<String> gen1 = new GenericTest<>();
		gen1.setItem("test1");
		System.out.println(gen1.getItem());
		
		GenericTest<Integer> gen2 = new GenericTest<>();
		gen2.setItem(1234567);
		
		System.out.println(gen2.convert(gen2));
		System.out.println(gen2.convert(gen1));
		
		
		// Generic : �Ķ���͸� �޾ƿö� �������� Ÿ������ üũ���ִ� ����
		// < > <-----
		// Ÿ���� �������� ���� ���׸��� �ʿ�.
		// ������ �ڵ忡���� ũ�� �������� ����
		// ������ ����������� �������� ���޵Ǵ� ��ü�� �����ؾ��Ҷ� �߸��� Ÿ����
		// ���޵Ǹ� ������ '�ɰ�'������.
		
		// col �̶�� ��ü�� �����ϴµ� red��� ���ڿ� �����Ͱ� ���� ���
		// ���� ���ڿ����� �߸��ƴٸ� �����߿� ������ �߻�.
		// Color col = new Color("red");
		// �����Ͱ� ������ �� �ִ� Ŭ������ ����� ���׸��� ����ؼ� Ÿ�Թ�����
		// ������ �� �ִ�.
		// Color col = new Color(Color.red);
		
		// ArrayList�� ��� Ŭ������ Object Ÿ���� �����͸� ������ �� �ִ�.
		// Object Ŭ������ �ֻ���Ŭ����(��� �ڹ� Ŭ������ ����Ŭ����)
		//  -> �Ƿ��� ��� �ڹ� Ŭ������ ��ҷ� �� �� �ִ�.
		// ArrayList�� ��� Ÿ�Ե��� ���� �� ������ ����� ��Ҹ� ���� ��
		// Ÿ���� �޶� ���� ������ �߻�(Ÿ�� �� ��)
		
		// �پ��� Ÿ���� ��ü�� �ٷ�� �޼��峪 �÷��� Ŭ������ �����ϰ�����
		// Ÿ��üũ�� ���ִ� ����� ���׸��̶� �Ѵ�.
		
		// ���׸��� ����
		// ���׸� Ŭ���� Ÿ���� ��ü ������ �����ڰ� ���ϴ� Ÿ���� ������ �� ����.
		// Ÿ���� �������� ����
		// �ǵ�ġ ���� Ÿ���� ��ü�� ����Ǵ� ���� ������ -> ����ȯ�� ������ ����
		//  -> ������ �ڵ��� ����.
		
		
		
		
		
		
		

	}

}
