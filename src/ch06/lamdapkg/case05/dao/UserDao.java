package ch06.lamdapkg.case05.dao;

import ch06.lamdapkg.case05.domain.User;

public interface UserDao {
  void insertUserInfo(User user);
  void updateUserInfo(User user);
  void deleteUserInfo(User user);
}