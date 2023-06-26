package ex;

public class Person {
  long id;

  public boolean equals(Object obj) {
    if(obj instanceof Person)
      return id == ((Person)obj).id;
    else
      return false;
  }

  Person(long id) {
    this.id = id;
  }
}

class TestMachine {
  public static void main(String[] args) {
    Person p1 = new Person(8011L);
    Person p2 = new Person(8011L);

    if(p1.equals(p2)) {
      System.out.println("같은 사람입니다.");
    } else {
      System.out.println("다른 사람입니다.");
    }
  }
}
