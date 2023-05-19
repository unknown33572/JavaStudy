package ch06.lamdapkg.case05.dao.mysql;

import ch06.lamdapkg.case05.dao.UserDao;
import ch06.lamdapkg.case05.domain.User;

public class UserDaoMysql implements UserDao{
  @Override
  public void insertUserInfo(User user) {
    System.out.println("Insert Into Mysql DB: "+user.getUserId());
  }

  @Override
  public void updateUserInfo(User user) {
    System.out.println("Update Set Mysql DB: "+user.getUserPw());
  }

  @Override
  public void deleteUserInfo(User user) {
    System.out.println("Delete From Mysql DB: "+user.getUserName());
  }
}