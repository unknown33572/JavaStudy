package ch05.interfacepkg.case01;

public class Ball {
  private int num;

  public int getNum(){
    return num;
  }
  public void setNum(int num){
    this.num=num;
  }
  @Override
  public String toString(){
    return num+"";
  }
}