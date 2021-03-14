package pa.lab4.compulsory.student;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import java.util.Comparator;

public @Data
@EqualsAndHashCode
class Student implements Comparator<Student> {
    @NonNull
    private String name;

    @Override
    public int compare(Student o1, Student o2){
        return o1.getName().compareTo(o2.getName());
    }
}
