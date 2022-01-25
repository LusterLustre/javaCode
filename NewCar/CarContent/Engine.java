package NewCar.CarContent;

public class Engine {
	
	String name;


	// �õ��� �ɷȴ��� ������ üũ�ϴ� �ʵ� ����
	boolean isStarted = false;
	
	// ������
	Engine(String carName) {
		this.name = carName;
	}
	
	
	// �õ��ɱ�
	// isStarted �ʵ带 �̿��ؼ�
	// 
	void start() {
		if (isStarted) {
			System.out.println(String.format("%s�� �̹� �õ��� �ɷ�����", name));
			return;
		}
		isStarted = true;
		System.out.println("�θ��θ�!");
	}
	
	// �õ�����
	void off() {
		if (!isStarted) {
			System.out.println(String.format("%s�� �̹� �õ��� ��������", name));
			return;
		}
		isStarted = false;
		System.out.println("�õ� off");
	}
	
	
	
	

}
