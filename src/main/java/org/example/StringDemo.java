package org.example;

//By default lang package is available in all classes


public class StringDemo {
    public static void main(String[] args) {
        //Counting Character Occurrences:
        String text = "programming";
        int length= text.length();
        System.out.println("Given String length : "+length);
       char value='g';
        int count=0;

        for(int index=0;index<length;index++){
            if(text.charAt(index)==value){
                count++;
            }
        }



        System.out.println("Number of Time Char g is presnt in given text : "+count);





        //index is always starts with 0













    }

}
