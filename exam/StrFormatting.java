package exam;

public class StrFormatting {

	public static void main(String[] args) {
		// StrFormatting
		// ���ڿ� ������ : ���ڿ� �ȿ� ��� ���� �����ϴ� ���.
		//int money = 15000;
		//String day = "tomorrow";
		//System.out.println(String.format("i need %d money %s", money, day));
		// ���ڿ� ���� �ڵ�
		// %s : ���ڿ�
		// %c : char
		// %d : ����
		// %f : �ε��Ҽ���
		// %o : 8����
		// %x : 16����
		// %% : ���� % �� ��ü
		// ������ Ʋ���� ����
		
		// ����
		// ������ ������ ����غ�����
		// ����� ����: error clean 95%
		// ����: ���ڴ� ���ڴ��, ���ڴ� ���ڴ��
		//System.out.println(String.format("error clean %d%%", 95));
		
		// ������ �ڵ�� ���� ���
		// �����ڵ� + ������ ������� ������ ��� ����
		// ���ڿ������� ���� ó��
		//System.out.println(String.format("%5s", "t"));
		// ����  �ڵ忡�� �����ڵ� ���� ������ �ǹ̴� ���̰� 10���� ���ڿ� ��������
		// ���Ե� ���� �������� �����ϰ� �������� �������� ���ܵζ�� �ǹ�
		
		// ���� ���ڰ� ������� ���Ե� ���� �������� ������ �������� �������� ó���Ѵ�.
		System.out.println(String.format("%-10sjm", "hi"));
		
		// format �޼��� ��� �Ʒ��� ���� ���·ε� ��� ����
		// �������� printf�� ����� ��¸� ����. format �޼���� ����� ��ȯ(����)
		System.out.printf("%-10sjm", "hi");
		
		
		
		
		
		
		
		
		
		
		
		//String str = "bi";
		//System.out.println(str.contains("iIb"));

	}

}
