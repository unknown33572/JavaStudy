package ex;

public class AudioPlayer extends Player {
  void play(int pos) {
    System.out.println(pos+" 위치부터 시작");
  }

  void stop() {
    System.out.println("정지");
  }

  void rew() {
    System.out.println("되감기");
  }

  void ff() {
    System.out.println("빨리감기");
  }
}
