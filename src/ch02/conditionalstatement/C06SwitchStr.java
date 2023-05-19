package ch02.conditionalstatement;

import java.util.Scanner;

public class C06SwitchStr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.println("1.골드 2.실버 3.브론즈");
		System.out.print("번호를 입력하세요.");
		num=input.nextInt();
		
		String grade="";
		if(num==1) {
			grade="Gold";
		} else if(num==2) {
			grade="Silver";
		} else if(num==3){
			grade="Bronz";
		}
		
		String coupon="";
		
		switch(grade) {
		case "Gold":
			coupon="10,000원";
			break;
		case "Silver":
			coupon="5,000원";
			break;
		case "Bronz":
			coupon="2,500원";
			break;
		default:
			System.out.println("없습니다.");
		}
		System.out.println(coupon);
	}
}
