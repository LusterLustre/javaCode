package java0119;

public class Configuration {
	// ���������� �����Ͽ� �ν��Ͻ��� ������ �� �ֵ����Ѵ�.
	private static Configuration config;
	
	private String test1 = "�׽�Ʈ1";
	private String test2 = "�׽�Ʈ2";
	
	// �׿� ���ÿ� �ν��Ͻ��� ������ �� �ִ� Ư���� ���� �޼��带 ���ؼ���
	//�ν��Ͻ��� �����ϵ��� ó���ϰ� �ν��Ͻ���
	public static Configuration getInstance() {
		if (config == null) {
			config = new Configuration();
		}
		return config;
	}
	
	public String getTest1Name() {
		return test1;
	}
	
	public String getTest2Name() {
		return test2;
	}
}

