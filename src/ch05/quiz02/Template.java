package ch05.quiz02;

import java.util.Scanner;

public abstract class Template {
  Scanner scanner=new Scanner(System.in);
  int cnt=0;
  abstract void input(Object[] s);
  abstract void output(Object[] s);
  abstract void modify(Object[] s);
  abstract void delete(Object[] s);
}
