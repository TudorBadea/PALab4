package pa.lab4.compulsory;

import pa.lab4.compulsory.student.Student;
import java.util.Comparator;

public class ApplicationsSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
