package ch05.abstractpkg.case04;

public class MyNotebook extends Notebook{
  @Override
  void getOnline() {
    System.out.println("나의 노트북으로 인터넷에 접속합니다.");
  }

  void DoWebcam(){
    System.out.println("웹캠으로 회의를 합니다.");
  }
}
