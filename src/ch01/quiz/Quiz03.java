package ch01.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x=0, y=0, z=0;
		int result=0;
		
		System.out.print("x값 입력: ");
		x=input.nextInt();
		System.out.print("y값 입력: ");
		y=input.nextInt();
		System.out.print("z값 입력: ");
		z=input.nextInt();
		
		result = (x > y) ? x :(y > z) ? y : z;
	}
}
