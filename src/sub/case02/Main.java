package sub.case02;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Customer> list = new ArrayList<>();

    Customer c1 = new Customer(1001, "신동일");
    Customer v1 = new VIPCustomer(1002, "김민혜");

    list.add(c1);
    list.add(v1);

    System.out.println("====고객 정보 출력====");
    for(Customer c : list){
      System.out.println(c.showCustomerInfo());
    }
    System.out.println();

    System.out.println("====가격 할인율과 보너스 포인트 계산====");
    int price = 10000;
    for(Customer c : list){
      int cost = c.calcPrice(price);
      System.out.println(c.customerName+"님이 "+cost+"원을 지불하셨습니다.");
      System.out.println(c.showCustomerInfo());
    }
  }
}
