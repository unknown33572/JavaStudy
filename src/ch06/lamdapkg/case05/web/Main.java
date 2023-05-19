package ch06.lamdapkg.case05.web;

import ch06.lamdapkg.case05.dao.UserDao;
import ch06.lamdapkg.case05.dao.mysql.UserDaoMysql;
import ch06.lamdapkg.case05.dao.oracle.UserDaoOracle;
import ch06.lamdapkg.case05.domain.User;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("사용하실 DB의 종류를 입력하세요.\n>");
    String db=sc.nextLine();
    UserDao userDao=null;
    if(db.equals("oracle")){
      userDao=new UserDaoOracle();
    }else if(db.equals("mysql")){
      userDao=new UserDaoMysql();
    }else{
      System.out.println("DB Support ERROR");
      return;
    }
    User user=new User();
    System.out.print("아이디를 입력하세요.\n>");
    user.setUserId(sc.next());
    System.out.print("패스워드를 입력하세요.\n>");
    user.setUserPw(sc.next());
    System.out.print("이름을 입력하세요.\n>");
    user.setUserName(sc.next());

    userDao.insertUserInfo(user);
    userDao.deleteUserInfo(user);
    userDao.updateUserInfo(user);
  }
}
