package ch02.loop;

public class C06Break {
  public static void main(String[] args) {
    int sum=0;
    int num=0;

    for(num=1; sum<=100; num++){
      sum += num;
    }
    System.out.println(sum);
    System.out.println(num);

    sum=0;
    for(num=1; ; num++){
      sum+=num;
      if(sum>=100)
        break;
    }
    System.out.println(sum);
    System.out.println(num);
  }
}
