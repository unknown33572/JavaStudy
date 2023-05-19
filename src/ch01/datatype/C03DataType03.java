package ch01.datatype;

public class C03DataType03 {

	public static void main(String[] args) {
		// 문자 타입과 리터럴
		char c1='가'; 		// 단일문자
		char c2=0xAC00;		// 유니코드 숫자(16진수)
		char c3=44032;		// 유니코드 숫자(10진수)
		char c4='\uAC00';   // 유니코드 문자
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		// 유니코드 인코딩
		int i1='가';
		int i2='\uAC00'; // 문자타입을 숫자타입으로 인코딩
		
		System.out.println(i1);
		System.out.println(i2);
	}

}
