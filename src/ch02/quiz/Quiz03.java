package ch02.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		String season;
		System.out.print("월을 입력하세요: ");
		month=input.nextInt();
		if(month>=3 && month<=5) {
			season="봄";
		}else if(month>=6 && month<=8) {
			season="여름";
		}else if(month>=9 && month<=11) {
			season="가을";
		}else if(month==12 || month==1 || month==2) {
			season="겨울";
		}else {
			season="없는 달";
		}
		System.out.println(month + "월은 " + season + "입니다.");
	}
}
