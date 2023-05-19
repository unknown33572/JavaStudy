package ch04.inheritancepkg.case09;

import ch04.inheritancepkg.case08.Animal;
import ch04.inheritancepkg.case08.Falcon;
import ch04.inheritancepkg.case08.Lion;

import java.util.ArrayList;


public class Test {
  public static void main(String[] args) {
    Animal lion=new Lion();
    Animal falcon=new Falcon();

    ArrayList<Animal>list=new ArrayList<>();
    list.add(lion);
    list.add(falcon);
    for(Animal animal:list){
      animal.move();
    }
  }
}
