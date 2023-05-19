package ch03.arraypkg;

public class C02Array {
  public static void main(String[] args) {
    int[] arr=new int[10];
    int total=0;
    for(int i=0; i<10; i++){
      System.out.println(arr);
    }
    for(int i=0, num=1; i<arr.length; i++){
      arr[i]=num++;
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    for(int num:arr){
      total+=num;
    }
    System.out.print(total);
  }
}
