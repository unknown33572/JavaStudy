package ch01.print;

public class C01Print {

	public static void main(String[] args) {

		int num=100;
		System.out.println(num);
		System.out.println("num의 값은 " + num + "입니다.");
		
		// printf(format, args)
		// 저장된 값이 출력되는 위치에 해당 타입의 형식(서식 지정자)를 넣어줌
		// 형식: %d(정수), %f(실수), %s(문자열), %c(단일문자), %b(boolean), \t 간격띄움, \n 줄바꿈
		System.out.printf("num의 값은 %d입니다.\n", num);
		
		double dNum=169.9;
		System.out.printf("dNum의 값은 %.1f입니다.\n", dNum);
		
		String sNum="가나다";
		System.out.printf("sNum의 값은 %s입니다.\n", sNum);
		
		char cNum='가';
		System.out.printf("cNum의 값은 %c입니다.", cNum);
	}

}
