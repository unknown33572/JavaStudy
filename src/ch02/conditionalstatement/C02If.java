package ch02.conditionalstatement;

public class C02If {
	public static void main(String[] args) {
		int visitCnt=0;
		
		if(visitCnt<1) {
			System.out.println("첫 방문");
			visitCnt++;
//			return; // 해당 메서드 반환하면서 종료
		}
		if(visitCnt>=1) { // 2되질 않아서 2이상으로 올리면 실행되지 않음
			System.out.println("재 방문");
		}
	}
}
