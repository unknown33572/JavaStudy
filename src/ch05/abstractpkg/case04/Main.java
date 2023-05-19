package ch05.abstractpkg.case04;

public class Main {
  public static void main(String[] args) {
//  Computer computer=new Computer();
    Computer desktop=new Desktop();
    desktop.show();
    desktop.getOnline();
    System.out.println();

//  Notebook nb=new Notebook();
    Computer myNb=new MyNotebook();
    myNb.getOnline();
    myNb.show();
    MyNotebook myNotebook=(MyNotebook)myNb;
    myNotebook.DoWebcam();
  }
}
