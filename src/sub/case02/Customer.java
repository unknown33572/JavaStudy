package sub.case02;

public class Customer {
  int customerID;
  String customerName;
  String customerGrade;
  int bounsPoint;
  double bonusRatio;

  public Customer(int customerID, String customerName) {
    this.customerID = customerID;
    this.customerName = customerName;
    customerGrade = "SILVER";
    bonusRatio = 0.01;
  }

  public int calcPrice(int price) {
    bounsPoint += price * bonusRatio;
    return price;
  }

  public String showCustomerInfo() {
    return String.format("%s님의 등급은 %s이며, 보너스 포인트는 %d입니다.",customerName,customerGrade,bounsPoint);
  }

  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
}
