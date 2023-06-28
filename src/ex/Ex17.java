package ex;

import java.util.ArrayList;

public class Ex17 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList(10);

    list.add(new Integer(5));
    list.add(new Integer(4));
    list.add(new Integer(3));
    list.add(new Integer(2));
    list.add(new Integer(1));

    System.out.println(list);

    ArrayList list2 = new ArrayList(5);
    list2.add(10);
    list2.add(20);
    list2.add(30);
    list2.add(40);
    list2.add(50);

    System.out.println(list2);


  }
}
