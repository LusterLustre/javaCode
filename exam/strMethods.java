package exam;

public class strMethods {

	public static void main(String[] args) {
		// strMethods
		// indexOf : ���ڿ����� Ư�� ���ڰ� ���۵Ǵ� ��ġ�� �����ϴ� �޼���
		//String idx = "happy lunch time";
		//System.out.println(idx.indexOf("time"));
		// ���� ã�� ���ڰ� ���ٸ� -1�� ���.
		//System.out.println(idx.indexOf("hungry"));
		
		// contains : ���ڿ����� Ư�� ���ڿ��� ���ԵǾ� �ִ°��� ���θ� �����ϴ� �޼���
		//System.out.println(idx.contains("time"));
		//System.out.println(idx.contains("hungry"));
		
		// equals : �� ���� ���ڿ��� ���������� ���� ������� ����.
		
		String equ1 = "hello";
		String equ2 = "lunch";
		String equ3 = "hello";
		String equ4 = new String("hello");
		
		//System.out.println(equ1.equals(equ2));
		//System.out.println(equ1.equals(equ3));
		//System.out.println(equ1.equals(equ4));
		//System.out.println(equ1==equ4);
		
		String idx = "happy lunch time";
		String idx2 = "hello everybody";
		
		// charAt, substring
		// charAt : ���ڿ����� Ư���� ��ġ�� ���ڸ� �̾Ƴ� �� ���.
		System.out.println(idx.charAt(4));
		// substring : ���ڿ��� Ư�� �κ��� �̾Ƴ� ��� ���
		System.out.println(idx2.substring(0, 4));
		
		// replace, replaceAll
		// replaceAll�� ����ǥ������ ��� �����ϴ�.
		// replace�� char, replaceall�� String
		String repl1 = "test";
		System.out.println(repl1.replaceAll("st", "ji"));
		
		// toUpperCase(��� �빮��), toLowerCase(��� �ҹ���)
		String case1 = "Funny Java";
		String result1 = case1.toUpperCase();
		String result2 = case1.toLowerCase();
		
		System.out.println(case1.toUpperCase());
		System.out.println(case1.toLowerCase());
		
		// split
		// ���ڿ��� Ư�� �����ڷ� �и�.
		
		String case2 = "q:w:e:r";
		String[] result = case2.split(":");
		System.out.println(result[0]);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
