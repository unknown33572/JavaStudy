package ex;

public class Ex08 {
  public static void main(String[] args) {
    Aircon samsungAircon = new Aircon();

    samsungAircon.setTemp(25);
    samsungAircon.setPower(true);
    samsungAircon.setWindPower(3);

    samsungAircon.printInfo();

    System.out.println();

    Aircon lgAircon = new Aircon(20, false, 2);

    lgAircon.printInfo();
  }
}