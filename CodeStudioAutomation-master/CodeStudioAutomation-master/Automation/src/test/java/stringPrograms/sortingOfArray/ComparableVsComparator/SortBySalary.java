package stringPrograms.sortingOfArray.ComparableVsComparator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CompareBySalary implements Comparable<CompareBySalary>{

    String name;
    int salary;

    CompareBySalary(String name,int salary){
        this.salary=salary;
        this.name=name;
    }

    @Override
    public int compareTo(CompareBySalary o) {
        int salary= Integer.compare(o.salary,this.salary);
        if(salary==0){
            return this.name.compareTo(o.name);
        }

        return salary;
    }

    @Override
    public String toString() {
        return name  +"::" +salary;
    }
}

public class SortBySalary {

    @Test
    public void test() {

        //    1️⃣ Sort Employees by Salary (Descending)
        List<CompareBySalary> list = new ArrayList<>();

        list.add(new CompareBySalary("Akshay", 2));
        list.add(new CompareBySalary("Ved", 1));
        list.add(new CompareBySalary("Anay", 5));
        list.add(new CompareBySalary("Pratiksha", 4));
        list.add(new CompareBySalary("Rutuja", 3));

        Collections.sort(list);

        System.out.println(list);

    }

}
