package problems;

/*fibonacci series
*
* eg: 0,1,1,2,3,5,8..
*
*
* */
public class Fibonacci {

   static int s1 = 0;
   static int s2 = 1;
   static int s3;
    public static void print(int a) {
        if (a > 0) {

            s3 = s2 + s1;
            s1 = s2;
            s2 = s3;
            System.out.print("+"+s3);

             print(a - 1);
        }

    }
        public static void main (String...Args){
            int s1 = 0;
            int s2 = 1;

            System.out.print("Fibonacci series :" + s1 + "+" + s2 );

            print(10);


        }
    }

