package ch02.quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu;
		System.out.println("출생지를 고르세요.");
		System.out.println("1.서울 2.경기 3.강원 4.경상 5.전라");
		System.out.print("번호를 선택하세요: ");
		menu=input.nextInt();
		if(menu==1) {
			System.out.println("출생 지역은 서울입니다.");
		} else if(menu==2) {
			System.out.println("출생 지역은 경기입니다.");
		} else if(menu==3) {
			System.out.println("출생 지역은 강원입니다.");
		} else if(menu==4) {
			System.out.println("출생 지역은 경상입니다.");
		} else if(menu==5) {
			System.out.println("출생 지역은 전라입니다.");
		} else {
			System.out.println("없는 번호 입니다.");
		}
	}
}
