package ch03.classpkg.case03;

public class Person {
  String name;
  int age;

  void setName(String myName){
    name=myName;
  }
  void setAge(int myAge){
    age=myAge;
  }
  String getName(){
    return name;
  }
  int getAge(){
    return age;
  }
}
