package org.example;

import java.util.Arrays;

public class ArraysDemo1 {

    public static void main(String[] args) {


        //More than 1 but same group of values
        String[] names = new String[4];
        String[] names1= {"rahim","surya","mahesh"};

        names[0] = "Rahim";
        names[1] = "Surya";
        names[2] = "Mahesh";
        names[3]= "Sivareddy";
        //Arrays.sort(names);
//        for(int i=0;i<names.length;i++) {
//            System.out.println(names[i]);
//        }

        int index = Arrays.binarySearch(names,"Rahim");
        System.out.println(index);



        //Arrays.binarySearch(names)


        //sort and search



//        System.out.println(names.toString());


    }

}
