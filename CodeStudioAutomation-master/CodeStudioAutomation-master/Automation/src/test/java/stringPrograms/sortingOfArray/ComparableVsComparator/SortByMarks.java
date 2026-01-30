package stringPrograms.sortingOfArray.ComparableVsComparator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CompareByMarks implements Comparable<CompareByMarks> {

    String name;
    int marks;

    CompareByMarks(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(CompareByMarks o) {
        int marks = Integer.compare(this.marks, o.marks);
        if (marks == 0) {
            return this.name.compareTo(o.name);
        }

        return marks;
    }

    @Override
    public String toString() {
        return name + "::" +marks;
    }
}

public class SortByMarks {
    //    Sort Students by Marks, if marks same sort by name
    @Test
    public void test() {
        List<CompareByMarks> list = new ArrayList<>();
        list.add(new CompareByMarks("Akshay",7));
        list.add(new CompareByMarks("Ved",5));
        list.add(new CompareByMarks("Rutuja",3));
        list.add(new CompareByMarks("Lata",9));
        list.add(new CompareByMarks("Shambhu",8));

        Collections.sort(list);

        System.out.println(list);
    }


}
