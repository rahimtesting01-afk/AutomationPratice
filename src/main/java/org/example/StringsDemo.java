package org.example;

public class StringsDemo {
    //String is a not a primitive data type
    //String is a class
    //group of characters
    //String is immutable (Once created cannot be changed)
    //Memory -> String pool and heap

    //String Builder
    //String Builder is mutable
    //String Builder is not thread safe and not synchronized

    //StringBuffer and StringBuilder -> Chat Bot
    //StringBuffer is mutable
    //String Buffer is a thread safe and synchronized


    //Mutable -> Once created we can change

    public static void main(String[] args) {
        String name = "Automation";//String pool and heap
        String name1 = new String("Automation");//heap


        if(name==name1){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }

        if(name.equals(name1)){
            System.out.println("Both are equal at Values");
        }
        else{
            System.out.println("Both are not equal at Values");
        }



//        String name3 = name + "Class";

//        System.out.println(name3);
//        System.out.println(name);
//        //App names,urls,version

//Problem : Compare 2 values and print true if both values are same ignore case sensitive


//        String value1 = "SELENIUMisanAutomationTool";
//
//        if(value1.contains("Automation1")){
//            System.out.println("it has Automation");
//
//        }
//        else{
//            System.out.println("it does not have Automation");
//        }


    //
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Automation");
        stringBuilder.append("Class");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());


















    }
}
