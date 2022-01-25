package exam;

import java.util.Random;

public class QuizAfter2 {
	public static void main(String[] args) {
		
		int a;
		int b = 0;

		for (int i=1; i<=50; i++)
		{
			a = new Random().nextInt(101);
			System.out.print(a + "\t");
			b += a;
			if(i % 6 == 0)
				System.out.println();
		}
		System.out.println("\nÇÕ = " + b);
		
	}
}
