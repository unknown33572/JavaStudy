package ch05.interfacepkg.case03.presentation;

import ch05.interfacepkg.case03.service.Service;

public class Io {
  private Service service;

  public Io(Service service){ //DI
    this.service=service;
  }
  public void setService(Service service){ //DI
    this.service=service;
  }
  public void greet(){
    System.out.println(service.greet());
  }
}
