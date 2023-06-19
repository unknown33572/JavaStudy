package ex;

public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second) {
    setHour(hour);
    setMinute(minute);
    setSecond(second);
  }

  void setHour(int hour) {
    if (hour < 0 || hour > 23) {
      return;
    }
    this.hour = hour;
  }

  int getHour() {
    return this.hour;
  }

  void setMinute(int minute) {
    if (minute < 0 || minute > 59) {
      return;
    }
    this.minute = minute;
  }

  int getMinute() {
    return this.minute;
  }

  void setSecond(int second) {
    if (second < 0 || second > 59) {
      return;
    }
    this.second = second;
  }

  int getSecond() {
    return this.second;
  }

  public String toString() {
    return this.hour + "시 " + this.minute + "분 " + this.second + "초";
  }
}
