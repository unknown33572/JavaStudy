package ch02.loop;

import java.util.Scanner;

public class C05Dowhile {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String input="";
    int len=0;

    do {
      System.out.print("> ");
      input=in.nextLine();

      len=input.length();
      System.out.println(len+"글자를 입력하셨습니다.");
    } while (len==0||len==1);
  }
}
