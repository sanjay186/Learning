package comparator.MuiltCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String... arg){
        List<Student> list =new ArrayList<>();
        list.add(new Student("sanjay" ,12));
        list.add(new Student("sans" ,34));
        list.add(new Student("huy" ,98));
        list.add(new Student("yhbg" ,87));

        Iterator<Student> it = list.iterator();
      System.out.println("*** unsorted **");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("*** sorted **");
        Collections.sort(list , new sortByNameAndRoll());
        for(Student s : list){
            System.out.println(s);
        }

    }
}
