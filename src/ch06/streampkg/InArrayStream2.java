package ch06.streampkg;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InArrayStream2 {
  public static void main(String[] args) {
    int[] ints={1,2,3,4,5};

    IntStream is = Arrays.stream(ints);
    is.forEach(i-> System.out.println(i));
    int sum = Arrays.stream(ints).sum();
    System.out.println(sum);
  }
}