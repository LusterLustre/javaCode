package exam;

public class StrBuffer {

	public static void main(String[] args) {
		// stringbuffer : ���ڿ��� �߰��ϰų� �����Ҷ� �ַ� ����ϴ� �ڷ���
		// ���� �߰��� ��ü�� ���� ������ �ʿ䰡 ���� ������ �޸� ��뿡�� �̵��� ���� ������ �� ����.
		// stringBuffer�� �����
		// �ڷ��� ũ�� ��ü�� ���ſ���. (string�� 2��)
		// String�� StringBuffer�� ���������� ������ �ʿ�
		
		// StringBuffer : �����۾��� ������
		// String : �����۾��� ���� ������.
		
		
		// ����
		// hello 2022 java web devTeam
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("2022");
		sb.append(" ");
		sb.append("java");
		sb.insert(0, "everybody");
		
		
		String result = sb.toString();
		System.out.println(result);
		
	}

}
