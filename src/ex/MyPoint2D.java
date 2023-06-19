package ex;

public class MyPoint2D extends MyPoint2 {
  int z;

  String getLocation() {
    return "x: " + this.x + ", y: " + this.y + ", z: " + this.z;
  }
}
