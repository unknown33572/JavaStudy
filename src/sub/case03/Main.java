package sub.case03;

public class Main {
  public static void main(String[] args) {
    SnackVM snackVM = new SnackVM();
    snackVM.insert("치토스");
    snackVM.insert("짱구");
    snackVM.insert("포카칩");

    System.out.println(snackVM.getCount());
    System.out.println(snackVM.takeout());
    System.out.println(snackVM.takeout());
    System.out.println(snackVM.takeout());
    System.out.println(snackVM.getCount());
  }
}
