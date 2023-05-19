package ch01.datatype;

public class C02DataType02 {

	public static void main(String[] args) {
		// 정수 타입과 정수형 리터럴
		byte b=-128;
		short s=12345;
		
		int i1=10;		//10 (10진수)
		int i2=0B1010;	//10 (2진수)
		int i3=012; 	//10 (8진수)
		int i4=0xA;		//10 (16진수)
		
		System.out.println(i1);
		System.out.println("10의 2진수: " + i2);
		System.out.println("10의 8진수: " + i3);
		System.out.println("10의 16진수: " + i4);
		
		long l1=100; 				// 자동 타입 변환(100 -> 100L) (int -> long)
		long l2=100L;
		long l3=20_000_000_000L; 	// int 범위 초과 시(21억) L 붙여줘야 선언 가능
		
		// 실수 타입과 실수형 리터럴
		float f=3.14f; 		// 3.14는 double 타입이기 때문에 float로 선언 시 뒤에 f를 붙여줘야 함
		double d1=3.14D;
		double d2=3.14;
		
		System.out.println(f);
		System.out.println(d1);
	}

}
