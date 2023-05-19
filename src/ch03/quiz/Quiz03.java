package ch03.quiz;

import java.util.Scanner;

public class Quiz03 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("인원수 입력: ");
    int num=in.nextInt();
    String[] name=new String[num];
    String[] telNum=new String[num];
    for(int i=0; i<num; i++){
      System.out.println("### "+(i+1)+" ###");
      System.out.print("이름 입력: ");
      name[i]=in.next();
      System.out.print("전화번호 입력:");
      telNum[i]=in.next();
    }
    for(int i=0; i<num; i++){
      System.out.println("### "+(i+1)+" ###");
      System.out.print("이름: "+name[i]+" 전화번호: "+telNum[i]+"\n");
    }
  }
}
