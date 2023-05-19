package ch02.conditionalstatement;

public class C04IfElseIf {
	public static void main(String[] args) {
		int score=100;
		char grade;
		
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else {
			grade='D';
		}
		
		System.out.println(grade);
	}
}
