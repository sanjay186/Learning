package problems;

import java.util.Scanner;

/*
* Write a Java Program to reverse a string without using String inbuilt function.
*
*
*
* */
public class StrReverse {
    public void stringBuilderMethod(String input){

        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println("Reversed the String with String Builder: "+ stringBuilder.reverse());
    }
    public void stringBuffer(String input){
        StringBuffer stringBuffer =new StringBuffer(input);
        System.out.println("Reversed the String with String buffer: "+ stringBuffer.reverse());
    }
    public void StringWithoutReverseMethod(String input){
        StringBuffer stringBuffer =new StringBuffer();

        for(int i=input.length()-1;i>=0;i-- ){
             stringBuffer.append(input.charAt(i));
        }
        System.out.println("Reversed the String with append method: "+stringBuffer );

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = sc.nextLine();
       StrReverse strReverse = new StrReverse();
       strReverse.stringBuilderMethod(input);
        strReverse.stringBuffer(input);
        strReverse.StringWithoutReverseMethod(input);
    }
}
