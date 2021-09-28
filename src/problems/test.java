package problems;

public class test {

    private static Boolean checkPrime(int a ){
        int rem;
        for(int i=2;i<=a/2;i++){
            rem=a%2;
            if(rem==0){
                return false;
            }

        }
        return true ;

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int start = 1;
        int end = 500;
        System.out.println("the prime number from 1 -500");
        //for(int j=start ; j<=end;j++){

        System.out.print(  checkPrime(15)) ;
//            if(checkPrime(j)){
//
//                System.out.print(j+" ");
//            }
       // }


    }
}
