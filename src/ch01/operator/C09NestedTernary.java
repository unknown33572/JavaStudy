package ch01.operator;

public class C09NestedTernary {

	public static void main(String[] args) {

		int score=0;
		char grade=0;
		
		grade=(score>=90) ? 'A':((score>=80)?'B':'C');
	}

}
