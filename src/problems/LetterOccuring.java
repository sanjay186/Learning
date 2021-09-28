/*
1) How to find the maximum occurring character in a given String? (solution)
Write an efficient Java program to return the maximum occurring character in the input string,
e.g.,
 if the input string is "Java" then the function should return 'a'

Read more: https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html#ixzz6kYDD6hxR*/

package problems;

import java.util.Scanner;

public class LetterOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        char w = '\0';;
        for(int i=0; i< word.length();i++){
            System.out.println(i);
            for(int j=i+1 ; j<=j+1 ; j++){
                System.out.println(j);
              int val=  Character.compare(word.charAt(i),word.charAt(j));
            if(val==0){
                w=word.charAt(i);
                count ++;
            }
            }
        }
        System.out.println("letter "+w);
    }
}
