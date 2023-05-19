package ch02.loop;

public class C04While {
  public static void main(String[] args) {
//    boolean flag=false;
//    int i=0;
//    int cnt=0;
//    while(!flag){
//      i=(int)(Math.random()*100)+1;
//      cnt++;
//      if(i%3==0){
//        flag=true;
//      }
//    }
//    System.out.println(cnt+"번만에 "+ i +"를 뽑았습니다.");
    int cnt=0;
    int random=1;
    while(!(random%3==0)){
      random=(int)(Math.random()*100)+1;
      cnt++;
    }
    System.out.printf("%d번만에 %d를 뽑았습니다.", cnt,random);
  }
}
