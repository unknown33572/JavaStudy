package ch03.arraypkg;

public class C06TwoDArray3 {
  public static void main(String[] args) {
    int[][]a=new int[2][3];
    int[][]arr={
        {1,2,3},
        {4,5,6}
    };
    int i,j;
    for(i=0; i< arr.length; i++){
      for(j=0; j< arr[i].length; j++){
        System.out.print(arr[i][j]+" ");
      }
    }
  }
}
