package com.cs;

public class Person {
    private String name;
    private int age;
    private int height;

    


public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


public void display(){
    
    System.out.println("name   "+name);
    System.out.println("age   "+age);
    System.out.println("height   "+height);
}

}


