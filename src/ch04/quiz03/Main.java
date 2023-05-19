package ch04.quiz03;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Stationery>bag=new ArrayList<>();

    bag.add(new Eraser());
    bag.add(new Pencil());

    for(Stationery s:bag){
      if(s instanceof Eraser) ((Eraser) s).erase(); //다운캐스팅
      if(s instanceof Pencil) ((Pencil) s).write();
    }
  }
}
