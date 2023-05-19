package ch01.operator;

public class C07ShortCircuit {

	public static void main(String[] args) {
		// 빠른 AND 와 빠른 OR - Short Circuit Evaluation
		boolean b=false;
		int x=0, y=0;
		
		b= (++x<0)&&(++y<0); // ()안에 입력해도 똑같음,   이미 앞 쪽에서 조건이 성립되어 y에는 값이 안올라감
		System.out.printf("x의 값: %d y의 값: %d 결과: %b\n", x,y,b);
		
		b= ++x>0&&++y<0; // 앞 쪽 조건이 true 이기 때문에 뒤 쪽 조건도 확인 후 비교연산자의 의해 false
		System.out.printf("x의 값: %d y의 값: %d 결과: %b\n", x,y,b);
		
		b= ++x>0||++y<0;
		System.out.printf("x의 값: %d y의 값: %d 결과: %b", x,y,b);
	}

}
