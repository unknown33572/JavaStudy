package sub.case02;

public class VIPCustomer extends Customer {
  double salesRatio;

  public VIPCustomer(int customerID, String customerName) {
    super(customerID, customerName);
    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;
  }

  @Override
  public int calcPrice(int price) {
    bounsPoint += price*bonusRatio;
    return price-(int)(price*salesRatio);
  }
}
