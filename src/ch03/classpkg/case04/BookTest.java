package ch03.classpkg.case04;

public class BookTest {
  public static void main(String[] args) {
    Book[] library=new Book[3];
    System.out.println(library);
    library[0]=new Book();
    library[1]=new Book();
    library[2]=new Book();

    library[0].title="해리포터";
    library[0].author="롤링";

    library[1].title="나무";
    library[1].author="베르나르";

    library[2].title="토지";
    library[2].author="박경리";

//    library[0].showBookInfo();
//    library[1].showBookInfo();
//    library[2].showBookInfo();
    for(int i=0;i< library.length;i++){
      library[i].showBookInfo();
    }
  }
}
