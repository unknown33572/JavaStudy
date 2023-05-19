package ch01.operator;

public class C08NotToggle {

	public static void main(String[] args) {
		// 논리 부정 연산자 !
		// boolean 타입 데이터만 사용
		// toogle 알고리즘 (스위치 on/off 개념)
		
		boolean power = false;
		
		power = !power; // ! not을 붙여서 true값으로 재할당
		System.out.println(power);
		
		power = !power; // 위쪽에서 true로 값을 줬는데 다시 not을 붙여서 false값으로 재할당
		System.out.println(power);
	}

}
