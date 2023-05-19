package ch02.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt=0;
		System.out.print("숫자를 입력하세요. ");
		cnt = in.nextInt();
		
		if(cnt%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}
