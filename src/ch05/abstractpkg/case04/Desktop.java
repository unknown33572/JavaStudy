package ch05.abstractpkg.case04;

public class Desktop extends Computer{
  @Override
  void show() {
    System.out.println("사무용 컴퓨터가 켜집니다.");
  }

  @Override
  void getOnline() {
    System.out.println("사무용 컴퓨터에서 인터넷에 접속합니다.");
  }
}
