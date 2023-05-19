package ch06.classpkg.case07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
  public static void main(String[] args) throws ClassNotFoundException {
    Class c = Class.forName("java.lang.String");

    Constructor[] cons = c.getConstructors();
    for(Constructor con : cons){
      System.out.println(con);
    }
    System.out.println();
    Method[] ms = c.getMethods();
    for(Method m : ms){
      System.out.println(m);
    }
  }
}