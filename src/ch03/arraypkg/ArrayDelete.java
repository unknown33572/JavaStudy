package ch03.arraypkg;

public class ArrayDelete {
  public static void main(String[] args) {
    int[] a= {1,2,3,4,5};

    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();

    // 배열 원소 삭제
    for(int i=2; i<a.length-1; i++){
      a[i]=a[i+1];
      System.out.print(a[i]+ " ");
    }
    System.out.println();
    //삭제 반영
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
    //삭제를 반영하고 출력
    for(int i=0; i<a.length-1; i++){
      System.out.print(a[i]+" ");
    }
  }
}
