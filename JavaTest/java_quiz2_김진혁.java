package JavaTest;

public class java_quiz2_김진혁 {
	
	public static long return_add(int a, int b) {
		
		int start = 0, end = 0;
        long sum = 0;
        
        // a와 b가 같으면 리턴
        if (a == b) {
            return a;
        } 
        // a와 b의 대소관계를 정해져 있지 않기 위해서 else if 조건문을 2개 만들어줌
        else if (a < b) {
            start = a;
            end = b;
        } else if (b < a) {
            start = b;
            end = a;	
        }
        
        // a와 b사이에 속한 모든 정수의 합 계산식을 사용
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        
        return sum;
    }
	
	public static void main(String[] args) {
		
		System.out.println(return_add(2, 5));
		System.out.println(return_add(5, 2));
		System.out.println(return_add(2, 2)); // a와 b가 같은 경우는 둘중 아무 수나 리턴
		
		
		
		
	}
}

