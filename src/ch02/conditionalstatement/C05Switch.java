package ch02.conditionalstatement;

import java.util.Scanner;

public class C05Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("### 출생 지역 선택 ###");
		System.out.println("1.서울");
		System.out.println("2.경기");
		System.out.println("3.강원");
		
		System.out.print("출생 지역 입력: ");
		int local=input.nextInt();
		
		switch(local) {
		case 1:
			System.out.println("출생지는 서울입니다.");
			break;
		case 2:
			System.out.println("출생지는 경기입니다.");
			break;
		case 3:
			System.out.println("출생지는 강원입니다.");
			break;
		default:
			System.out.println("없는 번호입니다.");
		}
		System.out.println("끝");
	}
}
