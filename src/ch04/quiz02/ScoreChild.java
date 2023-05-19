package ch04.quiz02;

public class ScoreChild extends ScoreParent{
  private int music;
  private int physical;

  public int getMusic() {
    return music;
  }

  public void setMusic(int music) {
    this.music = music;
  }

  public int getPhysical() {
    return physical;
  }

  public void setPhysical(int physical) {
    this.physical = physical;
  }

  @Override
  public void setSum(){
    super.setSum();
    sum = super.getSum() + music + physical;
  }
  @Override
  public void setAvg(){
    this.avg=sum/5.0;
  }
  public String toString(){
    String msg="### "+super.getName()+" ###\n";
    msg+="총점: "+sum+"\n";
    msg+="평균: "+avg+"\n";
    return msg;
  }
}
