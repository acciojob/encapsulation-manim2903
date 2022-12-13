package com.driver;

import java.util.concurrent.locks.ReadWriteLock;

public class Main {
  public static void main(String[] args){
      RWOnly obj=new RWOnly();
//      obj.name=Mnai;
//      System.out.print(obj.name);
//      name has private access in com.driver.RWOnly
      obj.setName("Mani");
      System.out.println(obj.getName());
  }
}