package pa.lab4.compulsory.school;

import pa.lab4.compulsory.school.School;

import java.util.Comparator;

public class SchoolComparator implements Comparator<School> {

    @Override
    public int compare(School o1, School o2) {
        return o1.getName().compareTo(o2.getName());
    }
}