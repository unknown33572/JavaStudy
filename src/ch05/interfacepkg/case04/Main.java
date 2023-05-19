package ch05.interfacepkg.case04;

import ch05.interfacepkg.case04.dao.user.UserDao;
import ch05.interfacepkg.case04.dao.user.UserDaoImpl;
import ch05.interfacepkg.case04.presentation.Console;
import ch05.interfacepkg.case04.presentation.user.UserIo;
import ch05.interfacepkg.case04.service.user.UserService;
import ch05.interfacepkg.case04.service.user.UserServiceImpl;

public class Main {
  public static void main(String[] args) {
    UserDao userDao=new UserDaoImpl();
    UserService userService=new UserServiceImpl(userDao);
    UserIo userIo=new UserIo(userService);

    Console.showInfo("앱을 시작합니다.");
    userIo.run();
    Console.showInfo("앱을 종료합니다.");
  }
}