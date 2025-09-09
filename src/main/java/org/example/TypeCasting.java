package org.example;

public class TypeCasting {


    //2 Types

    //Implicit -> Java is managing it (Auto Conversion) -> // byte-> short-> int-> long-> float-> double
    //Explicit -> Manually (Programmer)

    public static void main(String[] args) {

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'a';



        //We have prices in double like (29.9,9.9,15.9) but we need to validate values in int -> this will not work (we will get Compile Time Error)

        //We have prices in int like (29,9,15) but we need to validate values in double -> this will work

        int price1 = 29;
        int price2 = 9;
        int price3 = 15;

        double price4 = price1;

        //Explicit -> Manually (Programmer)
        //Converting String to Double
        java.lang.String price5 = getText();
        double price6 = Double.valueOf(price5);


    }


    private static String getText() {
        return "29.9";
    }
}
