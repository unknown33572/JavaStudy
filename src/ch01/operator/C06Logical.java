package ch01.operator;

public class C06Logical {

	public static void main(String[] args) {
		// 논리 연산자
		// AND &&
		// OR ||
		int a=10;
		int b=5;
		
		// AND &&
		System.out.println(a==a && b==b); //T
		System.out.println(a!=a && b==b); //F
		System.out.println(a==a && b!=b); //F
		System.out.println(a!=a && b!=b); //F
		
		System.out.println();
		
		// OR ||
		System.out.println(a==a || b==b); // T
		System.out.println(a!=a || b==b); // T
		System.out.println(a==a || b!=b); // T
		System.out.println(a!=a || b!=b); // F
	}

}
