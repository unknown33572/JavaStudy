package ch05.quiz;

public class StudentChild extends StudentParent{
  private String stuGender;
  private int age;

  public String getStuGender() {
    return stuGender;
  }

  public void setStuGender(String stuGender) {
    this.stuGender = stuGender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
