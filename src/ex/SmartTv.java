package ex;

public class SmartTv extends Tv {
  boolean caption;

  void displayCaption(String text) {
    if (this.caption) {
      System.out.println(text);
    }
  }
}
