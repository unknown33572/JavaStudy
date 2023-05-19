package ch03.quiz;

import java.util.Scanner;

public class Quiz01 {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int[] num=new int[5];
    for (int i=0; i<num.length; i++){
      System.out.print("번호를 입력하세요.\n> ");
      num[i]=input.nextInt();
    }
    System.out.println();
    for(int nums:num){
      System.out.println(nums);
    }
  }
}
