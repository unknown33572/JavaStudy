package ch05.interfacepkg.case01;

public class SlotMachine {
  public Ball hitSlot(){
    Ball ball=new Ball();
    ball.setNum(((int)(Math.random()*45)+1));
    return ball;
  }
}