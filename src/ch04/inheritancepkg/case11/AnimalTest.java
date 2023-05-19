package ch04.inheritancepkg.case11;

import java.util.ArrayList;

class Animal {
  public void move(){
    System.out.println("동물이 움직입니다.");
  }
}
class Human extends Animal{
  public void move(){
    System.out.println("사람이 두 발로 걷습니다.");
  }
  public void readBooks(){
    System.out.println("사람이 책을 읽습니다.");
  }
}
class Tiger extends Animal{
  public void move(){
    System.out.println("호랑이가 네 발로 뜁니다.");
  }
  public void hunt(){
    System.out.println("호랑이가 사냥을 합니다.");
  }
}
class Eagle extends Animal{
  public void move(){
    System.out.println("독수리가 하늘을 납니다.");
  }
  public void pectAt(){
    System.out.println("독수리가 모리를 쫍니다.");
  }
}
public class AnimalTest{
  public static void main(String[] args) {
    Animal hAnimal=new Human();
    Animal tAnimal=new Tiger();
    Animal eAnimal=new Eagle();

    ArrayList<Animal>list=new ArrayList<>();
    list.add(hAnimal);
    list.add(tAnimal);
    list.add(eAnimal);

    eAnimal.move(); //업캐스팅 돼서 부모메서드만 사용가능

    Eagle eagle=(Eagle)eAnimal;
    eagle.pectAt();
    System.out.println();
    AnimalTest test=new AnimalTest();
    test.testDownCasting(list);
  }
  public void testDownCasting(ArrayList<Animal>list){
    for(int i=0; i<list.size(); i++){
      Animal animal=list.get(i);
      if(animal instanceof Human){
        Human human=(Human)animal;
        human.readBooks();
      }else if(animal instanceof Tiger){
        Tiger tiger=(Tiger)animal;
        tiger.hunt();
      }else if(animal instanceof Eagle){
        Eagle eagle=(Eagle)animal;
        eagle.pectAt();
      }else{
        System.out.println("ERROR");
      }
    }
  }
}
