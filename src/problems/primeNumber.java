package problems;

import java.time.Clock;
import java.util.Scanner;

public class primeNumber {

   private  static Boolean isPrime(int numberToCheck){

       int remainder;
       for (int i = 2; i <= numberToCheck / 2; i++) {
           remainder = numberToCheck % i;
           //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
           if (remainder == 0) {
               return false;
           }
       }
       return true;

   }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int startVal = sc.nextInt();
        int endVal = sc.nextInt();
        sc.close();
        System.out.println("The prime number in "+startVal+"to"+endVal);

        for(int i = startVal ; i<=endVal;i++){
            if(isPrime(i)){
                System.out.print(i+" ");

            }
        }
    }
}
