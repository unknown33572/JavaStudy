package ex;

import java.util.ArrayList;

class Cube {
  int length;
  int width;
  int height;

  int area() {
    return length * width * height;
  }
}
public class GenericTest {
  public static void main(String[] args) {
    ArrayList<Tv> list = new ArrayList<Tv>();
    list.add(new Tv());
//    list.add(new Radio());

    Tv t = list.get(0);
    System.out.println(t);
//    Radio r = list.get(1);

    ArrayList list2 = new ArrayList();
    list2.add(4);

    int i = (int)list2.get(0);
    System.out.println(i);

    ArrayList<Cube> list3 = new ArrayList<Cube>();
    list3.add(new Cube());
    Cube c = list3.get(0);
    c.height = 10;
    c.length = 10;
    c.width = 10;
    System.out.println(c.area());
  }
}
