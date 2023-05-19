package sub.case03;

public class SnackVM extends VM implements Software {
  @Override
  public void insert(String snackName) {
    getVm().add(snackName);
  }

  @Override
  public String takeout() {
    return getVm().remove(0);
  }

  @Override
  public int getCount() {
    return getNumber();
  }
}
