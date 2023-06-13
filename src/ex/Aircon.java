package ex;

public class Aircon {
  private int temp;
  private boolean power;
  private int windPower;

  public Aircon() {
    this.temp = 24;
    this.power = false;
    this.windPower = 1;
  }

  public Aircon(int temp, boolean power, int windPower) {
    this.temp = temp;
    this.power = power;
    this.windPower = windPower;
  }

  public void setTemp(int temp) {
    this.temp = temp;
  }

  public int getTemp() {
    return this.temp;
  }

  public void setPower(boolean power) {
    this.power = power;
  }

  public boolean getPower() {
    return this.power;
  }

  public void setWindPower(int windPower) {
    this.windPower = windPower;
  }

  public int getWindPower() {
    return this.windPower;
  }

  public void printInfo() {
    System.out.println("온도: " + this.temp);
    System.out.println("전원: " + this.power);
    System.out.println("풍량: " + this.windPower);
  }
}
