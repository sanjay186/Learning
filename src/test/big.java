package test;

import java.util.Arrays;

public class big {

    int biggest(int[] n){

        int big =0;
        Arrays.sort(n);
       System.out.println(n[n.length -2]);
        for(int j=0 ; j<n.length;j++){
            System.out.println(n[j]);
        }
       return 1;
    }




    public static void main(String... Arg){
        big f= new big();
        int[] arr = new int[5];
//
        arr[0]=12;
        arr[1]=152;
        arr[2]=127;
        arr[3]=162;
        arr[4]=52;


        f.biggest(arr);
    }
}
