package ex;

public class Ex11 {
  public static void main(String[] args) {
    SmartTv samsungSmartTv = new SmartTv();

    samsungSmartTv.channel = 10;
    samsungSmartTv.channelUp();
    samsungSmartTv.caption = true;
    samsungSmartTv.displayCaption("Hello, World!");
  }
}
