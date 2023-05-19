package ch01.casting;

public class C03Overflow {

	public static void main(String[] args) {
		// 값 손실
		int a=1_000_000;
		int b=1_000_000;
		long c=a*b; // 20억을 훨씬 넘는 값
		
		System.out.println(c); // 값 손실이 발생하여 제대로 값이 출력되질 않음
		
		c=a*(long)b; // 값 재할당 후 int*long->long*long
		System.out.println(c);
		
		int x=1_000_000*1_000_000/1_000_000;
		System.out.println(x);
		
		int y=1_000_000/1_000_000*1_000_000;
		System.out.println(y);
	}

}
