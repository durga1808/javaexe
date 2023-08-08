package com.cs;

public class Main {
    public static Person processPerson(Person person){
        // String name=person.getName();
        // int age=person.getAge()+1;
        // int  height=person.getHeight();
        
        // Person newPerson=new Person(name, age,height);
        Person fff = new Person("chagedNmae", 0, 120);
        fff.setAge(person.getAge()+1);

        return fff;


    }

public static void main(String[] args){

Person person = new Person("Durga",22,151);
System.out.println("Original person information:");
person.display();
Person updatedPerson=processPerson(person);
System.out.println("\n updated person information:");
updatedPerson.display();
}
}