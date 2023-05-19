package ch01.casting;

public class C01Casting {

	public static void main(String[] args) {
		// 정수 타입의 크기: byte < short < int < long
		// 자동 타입 변환: 작은 타입에서 큰 타입으로 데이터 타입을 변환
		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		System.out.println(l); // 10
		
		// 강제 타입 변환(demotion): 큰 타입에서 작은 타입으로 데이터 타입을 명시해서 변환
		l=200; // 200->200L 자동타입변환(int->long)
		i=(int)l;
		s=(short)i;
		b=(byte)s;
		System.out.println(b); //-56 (값 손실,변질 발생)
	}

}
