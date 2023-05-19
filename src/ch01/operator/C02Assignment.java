package ch01.operator;

public class C02Assignment {

	public static void main(String[] args) {
		// 대입 연산자(=)
		// 오른쪽에 있는 식/값을 왼쪽의 변수에 저장
		int x=1, y=2;
		System.out.printf("x: %d y: %d\n", x,y);
		

		// 복합 대입연산자
		int i=3;	//3
		System.out.println("i의 값: " + i);
		i+=2; 		//5
		System.out.println("i의 값: " + i);
		x+=y; 		//3
		System.out.println("X의 값: " + x);
		
		i+=2; // 7
		System.out.println(i);
		i-=2; // 5
		System.out.println(i);
		i*=2; // 10
		System.out.println(i);
		i/=2; // 5
		System.out.println(i);
		i%=2; // 1
		System.out.println(i);
	}

}
