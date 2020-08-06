package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String[] Args){
        ArrayList<Student> ar =new ArrayList<>();
        ar.add(new Student(47 , "sanjay","london"));
        ar.add( new Student(12,"Kalai","USA"));
        ar.add(new Student(43,"sdrf","mexico"));


        for(int i=0 ; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("*** Sorted by Id ***");
        Collections.sort(ar ,new SortbyRoll());
        for(int i=0 ; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("*** Sorted by Name ***");
        Collections.sort(ar ,new SortbyName());
        for(int i=0 ; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }

}
