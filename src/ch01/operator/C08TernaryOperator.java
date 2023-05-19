package ch01.operator;

import java.util.Scanner;

public class C08TernaryOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int score=0;
		String result="";
		System.out.print("점수 입력: ");
		score=input.nextInt();
		
		result=(score>=60) ? "합격" : "불합격";
		
		System.out.println(result);
		System.out.printf("%d점은 %s입니다.", score, result);
	}

}
