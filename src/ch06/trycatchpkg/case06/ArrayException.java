package ch06.trycatchpkg.case06;

public class ArrayException {
  public static void main(String[] args) {
    int[] arr = new int[10];

    try {
      int result = arr[10];
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception 발생");
      e.printStackTrace();
    }
    System.out.println("End");
  }
}