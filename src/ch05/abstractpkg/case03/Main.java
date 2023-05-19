package ch05.abstractpkg.case03;

public class Main {
  public static void main(String[] args) {
    Fridge fridge=new Fridge();
    Appliance a = fridge;

    fridge.powerOn();
    fridge.powerOff();

    a.powerOn();
    a.powerOff();
    new Fridge().powerOn();
    new Fridge().powerOff();

    new Computer().powerOn();
  }
}
