package ch05.abstractpkg.case03;

public class Fridge extends Appliance{
  @Override
  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  @Override
  void powerOff() {
    System.out.println("전원을 끕니다.");
  }
}
