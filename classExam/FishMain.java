package classExam;

class FishBreadUp {
	
	static String bread = "�Ϲ� �а���";
	String cream;
	
	FishBreadUp (String cream) {
		this.cream = cream;
	}
	
	
}

public class FishMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishBreadUp fish1 = new FishBreadUp("��ũ��");
		FishBreadUp fish2 = new FishBreadUp("����");
		FishBreadUp fish3 = new FishBreadUp("����");
		
		System.out.println(fish1.cream+"�ؾ ���� �Ϸ�");
		System.out.println(fish2.cream+"�ؾ ���� �Ϸ�");
		System.out.println(fish3.cream+"�ؾ ���� �Ϸ�");
	}

}
