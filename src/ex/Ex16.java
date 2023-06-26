package ex;

public class Ex16 {
  public static void main(String[] args) {
    Unit[] group = new Unit[4];
    group[0] = new Marine();
    group[1] = new Tank();
    group[2] = new Tank();
    group[3] = new Dropship();

    Dropship d = (Dropship)group[3];

    for(Unit groups : group) {
      groups.move(100, 200);
    }
    d.load();
    d.check();
    d.unload();
    d.check();
  }
}

abstract class Unit {
  int x, y;
  abstract void move(int x, int y);
  void stop() {
    System.out.println("멈춥니다.");
  }
}

class Marine extends Unit {
  void move(int x, int y) {
    System.out.println("Marine[x=" + x + ",y=" + y + "]" + "으로 이동합니다.");
  }
  void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit {
  void move(int x, int y) {
    System.out.println("Tank[x=" + x + ",y=" + y + "]" + "으로 이동합니다.");
  }
  void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit {
  int people = 0;
  void move(int x, int y) {
    System.out.println("Dropship[x=" + x + ",y=" + y + "]" + "으로 이동합니다.");
  }
  void load() {
    /* 선택된 대상을 태운다. */
    people++;
    System.out.println(people + "명 탑승");
  }
  void unload() {
    /* 선택된 대상을 내린다. */
    System.out.println(people + "명 하차");
    people--;

  }
  void check() {
    System.out.println(people + "명 탑승중");
  }

}
