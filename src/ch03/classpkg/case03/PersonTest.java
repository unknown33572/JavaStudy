package ch03.classpkg.case03;

public class PersonTest {
  public static void main(String[] args) {
    Person p=new Person();
    p.name="신동일";
    p.age=30;
    System.out.printf("%s, %d\n", p.name,p.age);

    p.setName("김철수");
    p.setAge(20);
    System.out.printf("%s, %d\n", p.name,p.age);
    System.out.printf("%s, %d\n", p.getName(),p.getAge());
  }
}
