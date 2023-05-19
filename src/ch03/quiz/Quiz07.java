package ch03.quiz;

import java.util.Scanner;

class Student {
  String studentName;
  int kor;
  int eng;
  int math;
  int sum;
  double avg;

  Student(){}

  int sum(int x,int y,int z){
    this.sum=x+y+z;
    return sum;
  }
  void avg(int x){
    this.avg=x/3.0;
  }
  void showStudentInfo(){
    System.out.printf("%s 학생의 총점은 %d 점이고, 평균은 %.1f 점 입니다.\n", studentName,sum,avg);
  }
}

public class Quiz07 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Student stu1=new Student();
    stu1.studentName="신짱구";
    stu1.kor=100;
    stu1.eng=90;
    stu1.math=80;
    stu1.avg(stu1.sum(stu1.kor, stu1.eng, stu1.math));
    stu1.showStudentInfo();

    Student stu2=new Student();
    stu2.studentName="김철수";
    stu2.kor=100;
    stu2.eng=95;
    stu2.math=85;
    stu2.avg(stu2.sum(stu2.kor, stu2.eng, stu2.math));
    stu2.showStudentInfo();
  }
}
