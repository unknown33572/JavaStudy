package ch02.conditionalstatement;

public class C03IfElse {
	public static void main(String[] args) {
		int visitCnt=0;
		
		if(visitCnt<1) {
			System.out.println("첫 방문");
			visitCnt++;
		}else {
			System.out.println("재 방문");
		}
	}
}
