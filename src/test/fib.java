package test;



public class fib {
    int fibser(int[] n){
       int sum =0;
       int a = 0;
       int b =1;
       System.out.println(a +"+ "+b);
       for(int i = 0 ; i<n.length;i++){

           sum = b+n[i];
          System.out.print("+"+sum);
          b=sum;

       }
       return sum;
    }
    public static void main(String... Arg){
        fib f= new fib();
        int[] arr = new int[5];
        for(int j=0 ; j<arr.length;j++){
            arr[j]=j;
        }
        String test = "sanjay\t";
        String t = "sanjak";
        System.out.println(test+t);
        f.fibser(arr);
    }
}
