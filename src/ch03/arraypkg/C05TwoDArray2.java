package ch03.arraypkg;

public class C05TwoDArray2 {
  public static void main(String[] args) {
    int[][]arr=new int[3][4];
    int num=1;
    System.out.println(arr.length);
    System.out.println(arr[0].length);

    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j]=num);
        num++;
      }
      System.out.println();
    }
  }
}
