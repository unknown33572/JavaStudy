package ch01.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		int sum=0;
		double avg=0;
		char result;
		
		
		System.out.print("국어 점수 입력: ");
		kor=in.nextInt();
		System.out.print("영어 점수 입력: ");
		eng=in.nextInt();
		System.out.print("수학 점수 입력: ");
		math=in.nextInt();
		
		sum=kor+eng+math;
		avg=(double)sum/3;
		
		result=(avg>=90) ? 'A' : (avg>=80) ? 'B' : (avg>=70) ? 'C' : (avg>=60) ? 'D' : 'F';
		
		System.out.printf("총점은 %d, 평균은 %.1f, 학점은 %c", sum, avg, result);
	}

}
