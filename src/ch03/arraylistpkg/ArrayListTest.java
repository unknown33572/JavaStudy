package ch03.arraylistpkg;

import java.util.ArrayList;

public class ArrayListTest {
  public static void main(String[] args) {
    ArrayList<String> s=new ArrayList<String>();

    s.add("신동일"); // 객체 내용 삽입
    s.add("김수현");
    s.add("최민식");

    System.out.println(s.get(0));
    System.out.println(s.get(1));
    System.out.println(s.get(2));
    System.out.println();

    s.set(1, "리사"); //인덱스 번호 지정, 수정할 내용
    System.out.println(s.get(1));
    System.out.println();

    for(int i=0; i<s.size(); i++){
      System.out.println(s.get(i));
    }
    System.out.println();

    s.remove(2);

    for(String ss:s){
      System.out.println(ss);
    }
    System.out.println();

    s.removeAll(s);// 전부 삭제
    System.out.println(s.size());
    System.out.println();
  }
}
