package ch01.input;

import java.util.Scanner;

public class C03Input03 {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = input.next();
		
		System.out.println("이름: " + name);
		
		System.out.print("나이 입력: ");
		int age = input.nextInt();
		
		System.out.println("나이: " + age);
		
		System.out.println("점수 입력: ");
		double score = input.nextDouble();
		
		System.out.println("점수: " + score);
		
	}

}
