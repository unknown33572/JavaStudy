package ch03.arraypkg;

public class C03Array {
  public static void main(String[] args) {
    double[] d=new double[5];
    d[0]=1.1;
    d[1]=2.1;
    d[2]=3.1;
    double mTotal=1;
    for(int i=0; i<d.length; i++){
      mTotal*=d[i];
    }
    System.out.println(mTotal);
  }
}
// 배열객체를 5개 생성했는데 인덱스 d[0],[1],[2] 에만 값을 넣고 d[4],[5] 에는 값을 넣지 않고
// 연산을 했기 때문에 값은 0