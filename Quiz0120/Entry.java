package Quiz0120;

public class Entry {
	
	String word;

	Entry() {
		System.out.println("***������***");
	}
	
	Entry(String w) {
		this.word = w;
	}

	public void writeView() {
		System.out.println("������: " + this.word);
	}
}