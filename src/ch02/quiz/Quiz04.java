package ch02.quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int myChoice=0;
		int comChoice=0;
		String choice="";
		String result="";

		System.out.println("1.가위 2.바위 3.보");
		System.out.print("> ");
		myChoice=input.nextInt();
		comChoice=(int)(Math.random() * 3) + 1;

		if(1<=myChoice&&myChoice<=3) {
			switch (myChoice - comChoice) {
				case -2: case 1:
					result = "You Win!";
					break;
				case -1: case 2:
					result = "You Lose...";
					break;
				case 0:
					result = "Draw.";
			}
			switch (myChoice){
				case 1: choice="가위"; break;
				case 2: choice="바위"; break;
				case 3: choice="보"; break;
			}
			System.out.println("You: " + choice);
			switch (comChoice){
				case 1: choice="가위"; break;
				case 2: choice="바위"; break;
				case 3: choice="보"; break;
			}
			System.out.println("Com: " + choice);
		}else {
			System.out.println("입력오류: 메뉴의 번호를 입력하세요.");
		}
		System.out.println(result);
	}
}