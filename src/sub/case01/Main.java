package sub.case01;

public class Main {
  public static void main(String[] args) {
    Customer c1 = new Customer(1001, "신동일");
    c1.bounsPoint = 1000;
    System.out.println(c1.showCustomerInfo());

    VIPCustomer v1 = new VIPCustomer(1002, "김민혜");
    v1.bounsPoint = 1000;
    System.out.println(v1.showCustomerInfo());

    Customer v2 = new VIPCustomer(1003, "아무개");
    v2.bounsPoint = 2000;
    System.out.println(v2.showCustomerInfo());

    System.out.println();

    c1.calcPrice(10000);
    v1.calcPrice(10000);
    System.out.println(c1.showCustomerInfo());
    System.out.println(v1.showCustomerInfo());
  }
}