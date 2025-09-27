package org.example;

public class Operators
{



    public static void main(String[] args) {

        //Arthimetic Operators
        int a=10;
        int b=20;
        int c= a+b;
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);



        System.out.println("After Adding a and b output is :"+c);

        //Comparison Operators:
        //==,!=,<,>,<=,>=
        System.out.println(a>b);//(10>20)-> False
        System.out.println(a<b);//(10<20)-> True
        System.out.println(a==b);

        //Logical Operators
        //&& !! !

        String pageTitle = "Products";//Actual Value -> We are going to get  this value through Automation
        String expectedPageTitle = "Products";//Expected Value

        if(pageTitle.equals(expectedPageTitle) && !pageTitle.isEmpty()){
            System.out.println("Title is Verified");
        }

        //Assignment Operators
        //=,+=,-=,*=,/=,%=

        //Test is failing if it is failing try one more time if it is fail mark it as Fail
        int retry=0;
        while(retry<2){
            System.out.println("Retrying the test"+retry);
            retry+=1;

        }

        //Unary Operator (++,--)
        //Test is failing if it is failing try one more time if it is fail mark it as Fail

        int retry1=0;
        while(retry1<2){
            System.out.println("Retrying the test"+retry1);// Concatination
            retry1++;
        }














    }




}
