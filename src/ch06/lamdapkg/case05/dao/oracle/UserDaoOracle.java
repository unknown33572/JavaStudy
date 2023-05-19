package ch06.lamdapkg.case05.dao.oracle;

import ch06.lamdapkg.case05.dao.UserDao;
import ch06.lamdapkg.case05.domain.User;

public class UserDaoOracle implements UserDao{
  @Override
  public void insertUserInfo(User user) {
    System.out.println("Insert Into ORACLE DB"+user.getUserId());
  }

  @Override
  public void updateUserInfo(User user) {
    System.out.println("Update Set ORACLE DB"+user.getUserPw());
  }

  @Override
  public void deleteUserInfo(User user) {
    System.out.println("Delete From ORACLE DB"+user.getUserName());
  }
}