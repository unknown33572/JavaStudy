package ch06.trycatchpkg.case06;

public class NullExceptionHandling {
  public static void main(String[] args) {
    try {
      throw new NullPointerException("NullPointer 에러 연습");
    }catch(NullPointerException e) {
      System.out.println("객체 생성 없이는 메소드 호출이 불가능합니다.");
      System.out.println(e.getMessage());
      System.out.println(e);
    }
  }
}
