package ch03.quiz;

import java.util.Scanner;

public class Quiz04 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("방 개수 입력: ");
    int cnt=in.nextInt();
    System.out.print("방 번호 입력: ");
    int num=in.nextInt();
    System.out.println();
    boolean[] check=new boolean[cnt];
    boolean running=true;
    while(running){
      System.out.println("#### "+"선택 메뉴"+" ####");
      System.out.println("1.입실\n2.퇴실\n3.방정보\n4.프로그램종료");
      System.out.print("> ");
      int menu=in.nextInt();
      System.out.println();
      int roomNum=0;
      switch(menu){
        case 1:
          System.out.print("입실할 방 번호 입력: ");
          roomNum=in.nextInt()-num;
          if(roomNum<0||roomNum>=check.length){
            System.out.println("존재하지 않는 방 번호입니다.");
            System.out.println();
            continue;
          }
          if(check[roomNum]){
            System.out.print("이미 배정된 방입니다.");
          }else{
            check[roomNum]=true;
            System.out.println("입실 처리되었습니다.");
          }
          System.out.println();
          break;
        case 2:
          System.out.println("퇴실할 방 번호 입력: ");
          roomNum=in.nextInt()-num;
          if(roomNum<0||roomNum>=check.length){
            System.out.println("존재하지 않는 방 번호입니다.");
            System.out.println();
            continue;
          }
          if(check[roomNum]){
            check[roomNum]=false;
            System.out.println("퇴실 처리되었습니다.");
          }else{
            System.out.println("이미 비어있는 방입니다.");
          }
          System.out.println();
          break;
        case 3:
          System.out.println("---- 방 정보 ----");
          for(int i=0; i<check.length; i++){
            if(check[i]){
              System.out.printf("%d번 방: %s\n", num+i,"입실중");
            }else{
              System.out.printf("%d번 방: %s\n", num+i,"비어있음");
            }
          }
          break;
        case 0:
          running=false;
          break;
        default:
          System.out.println("없는 메뉴 번호입니다.");
      }
    }
  }
}
