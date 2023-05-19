package ch05.interfacepkg.case04.service.user;

import ch05.interfacepkg.case04.dao.user.UserDao;
import ch05.interfacepkg.case04.domain.User;

public class UserServiceImpl implements UserService{
  private UserDao userDao;
  public UserServiceImpl(UserDao userDao){ //DI
    this.userDao=userDao;
  }
  @Override
  public User searchUser() {
    return userDao.getUser();
  }
}
