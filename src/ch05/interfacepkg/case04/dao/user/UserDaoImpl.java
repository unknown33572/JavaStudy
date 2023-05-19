package ch05.interfacepkg.case04.dao.user;

import ch05.interfacepkg.case04.domain.User;

import java.util.Scanner;

public class UserDaoImpl implements UserDao{
  Scanner sc=new Scanner(System.in);
  @Override
  public User getUser() {
    System.out.println("이름을 입력하세요.");
    System.out.print("> ");
    return new User(sc.next());
  }
}