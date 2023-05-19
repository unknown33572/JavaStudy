package ch06.classpkg.case07;

public class StudentTest {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Class c1 = Class.forName("ch06.classpkg.case07.Student");
    Student s1 = (Student) c1.newInstance();
    s1.setStuId(1234);
    s1.setStuName("신동일");
    System.out.println(s1);

    Class c2 = s1.getClass();
    Student s2 = (Student) c2.newInstance();
    s2.setStuId(4321);
    s2.setStuName("일동신");
    System.out.println(s2);
  }
}