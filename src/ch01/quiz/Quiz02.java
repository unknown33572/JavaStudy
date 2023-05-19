package ch01.quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("x의 값 입력: ");
		int x=input.nextInt();
		
		System.out.print("y의 값 입력: ");
		int y=input.nextInt();
		
//		int i=x+y;
//		System.out.println("x + y의 값: " + i);
		
		System.out.printf("%d + %d: %d", x,y,x+y);
	}
}
