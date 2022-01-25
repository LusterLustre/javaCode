package Quiz0120;

public class SubEntry extends Entry {
	String definition;
	int year;
	
	SubEntry(String w) {
		super(w);
	}
	
	SubEntry(String w, String d, int y) {
		super(w);
		definition=d;
		year=y;
	}
	
	public void printView() {
		System.out.println("원어: " + definition);
		System.out.println("시기: " + year);
	}

}
