package ch05.quiz02;

public class ScoreService extends Template{

  @Override
  void input(Object[] o) {
    Score[]s=(Score[])o; //다운 캐스팅
    s[cnt]=new Score();
    System.out.print("이름 입력: ");
    s[cnt].name=scanner.next();
    System.out.print("국어 입력: ");
    s[cnt].kor=scanner.nextInt();
    System.out.print("영어 입력: ");
    s[cnt].eng=scanner.nextInt();
    System.out.print("수학 입력: ");
    s[cnt].math=scanner.nextInt();
    s[cnt].getSum();
    s[cnt].getAvg();
    cnt++;
  }

  @Override
  void output(Object[] o) {
    for(int i=0; i<cnt; i++){
      Score s=(Score)o[i]; // 다운 캐스팅
      System.out.println("이름: "+s.name);
      System.out.println("총점: "+s.getSum());
      System.out.println("평균: "+s.getAvg());
    }
  }

  @Override
  void modify(Object[] o) {

  }

  @Override
  void delete(Object[] o) {

  }

  public int menu() {
    System.out.println("1.입력");
    System.out.println("2.출력");
    System.out.println("3.수정");
    System.out.println("4.삭제");
    System.out.println("0.종료");
    System.out.print("> ");
    return scanner.nextInt();
  }
}
