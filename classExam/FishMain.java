package classExam;

class FishBreadUp {
	
	static String bread = "ÀÏ¹Ý ¹Ð°¡·ç";
	String cream;
	
	FishBreadUp (String cream) {
		this.cream = cream;
	}
	
	
}

public class FishMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishBreadUp fish1 = new FishBreadUp("½´Å©¸²");
		FishBreadUp fish2 = new FishBreadUp("¹ÎÃÊ");
		FishBreadUp fish3 = new FishBreadUp("¿¬¾î");
		
		System.out.println(fish1.cream+"ºØ¾î»§ Á¦ÀÛ ¿Ï·á");
		System.out.println(fish2.cream+"ºØ¾î»§ Á¦ÀÛ ¿Ï·á");
		System.out.println(fish3.cream+"ºØ¾î»§ Á¦ÀÛ ¿Ï·á");
	}

}
