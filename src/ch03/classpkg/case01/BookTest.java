package ch03.classpkg.case01;

public class BookTest {
  public static void main(String[] args) {
    Book b1=new Book();
    b1.title="나무";
    Book b2=new Book();
    b2.title="파피용";
    System.out.println(b1.title);
    System.out.println(b2.title);
  }
}
