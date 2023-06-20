package ex;

public class PlayerTest {
  public static void main(String[] args) {
    AudioPlayer ap = new AudioPlayer();
    ap.play(100);
    ap.stop();
    ap.rew();
    ap.ff();

    Player p = new AudioPlayer();
    p.play(200);
    p.stop();
    /*
    p.rew(); // 참조변수가 Player 타입이므로 Player 클래스에 정의된 메서드만 호출 가능
    p.ff();
     */
  }
}
