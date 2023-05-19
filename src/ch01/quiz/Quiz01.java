package ch01.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int a=1;
		int b=3;
		
		int c=0;
		
		System.out.printf("a: %d b: %d\n", a, b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.printf("a: %d b: %d", a, b);
	}
}
