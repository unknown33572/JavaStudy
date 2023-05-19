package ch03.classpkg.case02;

public class StudentTest {
  public static void main(String[] args) {
    Student stu1=new Student();
    stu1.studentName="김철수";
    stu1.address="서울";
    stu1.showStudentInfo();

    Student stu2=new Student();
    stu2.studentName="신짱구";
    stu2.address="서울";
    stu2.showStudentInfo();
  }
}
