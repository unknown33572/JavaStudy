package ch05.interfacepkg.case03;

import ch05.interfacepkg.case03.presentation.Io;
import ch05.interfacepkg.case03.service.Service;
import ch05.interfacepkg.case03.service.ServiceEng;
import ch05.interfacepkg.case03.service.ServiceKor;

public class Main {
  public static void main(String[] args) {
    Service serviceKor=new ServiceKor();
    Service serviceEng=new ServiceEng();

    Io io=new Io(serviceKor);
    io.greet();

    io.setService(serviceEng);
    io.greet();
  }
}