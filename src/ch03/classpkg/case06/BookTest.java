package ch03.classpkg.case06;

public class BookTest {
  public static void main(String[] args) {
    Book[]library=new Book[3];
    library[0]=new Book("해리포터1", "롤링");
    library[1]=new Book("해리포터2", "롤링");
    library[2]=new Book("해리포터3", "롤링");

    library[0].showBookInfo();
    library[1].showBookInfo();
    library[2].showBookInfo();
  }
}
