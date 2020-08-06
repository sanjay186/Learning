package comparator;

import java.util.Comparator;

public class SortbyRoll implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        return o2.roll - o1.roll;
    }
}
