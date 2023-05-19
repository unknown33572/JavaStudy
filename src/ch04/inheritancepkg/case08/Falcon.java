package ch04.inheritancepkg.case08;

public class Falcon extends Animal{

  @Override
  public void move(){
    System.out.println("매가 날아오릅니다.");
  }
  public void pectAt(){
    System.out.println("매가 모이를 쫍니다.");
  }
}
