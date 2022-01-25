package Quiz0120;

public class Entry {
	
	String word;

	Entry() {
		System.out.println("***약어사전***");
	}
	
	Entry(String w) {
		this.word = w;
	}

	public void writeView() {
		System.out.println("약어출력: " + this.word);
	}
}