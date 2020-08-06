package comparator.MuiltCompare;

import java.util.Comparator;

public class sortByNameAndRoll implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int RollCompare = o1.getRollNo() - o2.getRollNo();
        int NameCompare = o1.getName().compareTo(o2.getName());

        if(NameCompare == 0){
            return (RollCompare==0?NameCompare:RollCompare);
        } else{
            return RollCompare;
        }

    }
}

