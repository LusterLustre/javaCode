package classExam;
//Ŭ��������
class FishBread {
	
	public String fishCode; // �ؾ��ȣ
	public String inside; // �ؾ�� ��
	public String flourCode; // �а���
	
	public void showFish() {
		System.out.println("��ȣ : " + fishCode + "\n��� : "
				+ inside + "\n������ : " + flourCode);
	}
}

public class FishBreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishBread fi = new FishBread();
		fi.fishCode = "001";
		fi.inside = "��";
		fi.flourCode = "�̱���";
		
		fi.showFish();
		
		System.out.println();
		
		FishBread fi2 = new FishBread();
		fi2.fishCode = "002";
		fi2.inside = "��ũ��";
		fi2.flourCode = "�߱���";
		
		fi2.showFish();
		
		// AvanteBuild��� ������ �����ϰ�
		// NewAvante ��� Ŭ������ ������
		// ������ ������ �����ϵ��� �������ּ���
		
		// Ŭ������ ���� �������
		// 1. ���͸�
		// 2. �ӵ�
		// 3. �⸧ (�⸧�� �ִ� 50L)
		
		// Ŭ������ �޼���
		// speedUp
		// �� �޼��带 ȣ���Ҷ����� �ش� �ν��Ͻ��� �ӵ� ������ ���� ����.
		// showCar
		// �� �޼��� ȣ��� �ش� �ν��Ͻ� ��������� ���� Ȯ��
		
		
		
		
	}

}
