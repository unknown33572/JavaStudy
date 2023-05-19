package ch03.classpkg.case06;

public class Book {
  String title;
  String author;
  public Book(String title, String author){
    this.title=title;
    this.author=author;
  }
  void showBookInfo(){
    System.out.println(title+", "+author);
  }
}
