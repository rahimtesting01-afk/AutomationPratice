package org.example;

import java.lang.reflect.Constructor;

public class Variable {

    //Task -> Requirement -> Need to print all student names who are joined today:

    //Object Creation

    //Variable variable = new Variable();

    //JVM -> Memory Allocation -> Heap Area
    //College Portal Login -> Student Id and Email and Marks are Non-Static (Because which are changing from Student to Student) -> Example of Non-Static
    //College Name -> Static

    //Local Variables:
    //Non-Static Variables:
    //Object Reference Values
    //Static Variables:

   static String collegeName="Engineering College";

    //Non-Static -> Global Level or Class Level
     String student5="Siva Reddy";
     String student6="Ashok";
     String student7="Surya";

     //Default Values
    static String univerSityName;
    String professorName;


    public static void main(String[] args) {

        String event="";
        System.out.println(event);//Local Variable

        System.out.println(collegeName);

        Variable variable = new Variable(); //(Constructor)
        System.out.println(variable.student5);
        System.out.println(variable.student6);
        System.out.println(variable.student7);

        System.out.println(univerSityName);
        System.out.println(variable.professorName);


    }





}
