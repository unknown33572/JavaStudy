package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GenericTest02 {
  public static void main(String[] args) {
    ArrayList<Human> list = new ArrayList<Human>();
    list.add(new Human("홍길동", 20));
    list.add(new Human("김삿갓", 30));
    list.add(new Human("이몽룡", 40));

    Iterator<Human> it = list.iterator();
    while (it.hasNext()) {
      Human h = it.next();
      System.out.println(h.name + " " + h.age + "세");
    }

    HashMap<String, Human> map = new HashMap<String, Human>();
    map.put("조선사람", new Human("홍길동", 20));
    map.put("고려사람", new Human("김삿갓", 30));
    map.put("삼국사람", new Human("이몽룡", 40));

    Iterator<String> it2 = map.keySet().iterator();
    while (it2.hasNext()) {
      String key = it2.next();
      Human h = map.get(key);
      System.out.println(key + " " + h.name + " " + h.age + "세");
    }
  }
}

class Human {
  String name;
  int age;

  Human(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
