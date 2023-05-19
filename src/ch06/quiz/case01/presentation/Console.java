package ch06.quiz.case01.presentation;

import java.util.Scanner;

public interface Console {
  Scanner sc=new Scanner(System.in);

  static int inNumber(String message){
    int number=0;
    boolean isGoodValue=false;
    String line="";

    do{
      System.out.print(message+": ");
      line=sc.nextLine();
      if(line.length() > 0 && line.matches("[0-9]*")){
        number=Integer.parseInt(line);
        if(0 < number && number <= 100){
          isGoodValue=true;
        }
      }
      if(!isGoodValue){
        System.out.print("ERROR 0-100 사이의 숫자를 입력하세요.");
      }
    }while(!isGoodValue);
    return number;
  }

  public static void showInfo(Object obj){
    System.out.println(obj.toString());
  }

  public static void showInfo(String message){
    System.out.println(message);
  }
}
