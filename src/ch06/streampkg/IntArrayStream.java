package ch06.streampkg;

import java.util.Arrays;

public class IntArrayStream {
  public static void main(String[] args) {
    int[] ints={1,2,3,4,5};
    for(int num:ints){
      System.out.println(num);
    }
    System.out.println();
    Arrays.stream(ints).forEach(n->System.out.print(n+" "));
  }
}
