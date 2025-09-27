package org.example;

public class StringBuilderDemo {

    public static void main(String[] args) {

        //Urls appending or logging
        //Reversing a String:
        String originalString = "hello";

        //output : olleh
        StringBuilder stringBuilder = new StringBuilder();//Empty
        stringBuilder.append(originalString);//hello
        System.out.println(stringBuilder.reverse());//olleh





    }
}
