package com.cs;

public class Cls {
   public String name;
   public int age;
    public void m1(){
        name="Durga";
        age=22;
    }
public static void main(String[] args) {
 Cls cd =new Cls();
 cd.m1();    
 System.out.println(cd.name);
System.out.println(cd.age);
    }
}
