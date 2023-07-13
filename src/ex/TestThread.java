package ex;

public class TestThread implements Runnable {
  static boolean autoSave = false;

  public void run() {
    while(true) {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if(autoSave) autoSave();
    }
  }

  private void autoSave() {
    System.out.println("작업파일이 자동저장되었습니다.");
  }

  public static void main(String[] args) {
    Thread t = new Thread(new TestThread());
    t.setDaemon(true);
    t.start();

    for(int i=1; i<=10; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(i);
      if(i==5) autoSave = true;
    }
    System.out.println("프로그램을 종료합니다.");
  }
}
