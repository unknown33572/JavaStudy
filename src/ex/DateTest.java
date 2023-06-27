package ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
  public static void main(String[] args) {
    DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");

    Date d = new Date();

    System.out.println(df.format(d));
    System.out.println(d);
    System.out.println(df.format(new Date()));
  }
}
