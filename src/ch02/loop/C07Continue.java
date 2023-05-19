package ch02.loop;

public class C07Continue {
  public static void main(String[] args) {
    int i=0;
    while(i<5){
      i++;
      if(i==2)continue;
      System.out.println(i);
    }
  }
}
