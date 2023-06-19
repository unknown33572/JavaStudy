package ex;

public class Tv {
  boolean power;
  int channel;

  void power() {
    this.power = !this.power;
  }

  void channelUp() {
    this.channel++;
  }

  void channelDown() {
    this.channel--;
  }

}
