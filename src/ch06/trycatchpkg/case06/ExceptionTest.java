package ch06.trycatchpkg.case06;

public class ExceptionTest {
  public static void go() throws ArrayIndexOutOfBoundsException {
    String[] greetings = {"Hello", "Hola", "안녕하세요"};
    int i=0;
    while(i<4) {
      System.out.println(greetings[i]);
      i++;
    }
  }

  public static void main(String[] args) {
    try {
      go();
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    System.out.println("End");
  }
}
