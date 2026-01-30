package stringPrograms.sortingOfArray.ComparableVsComparator;


import org.testng.annotations.Test;

import java.util.*;

public class ComparatorTest {

    //    1️⃣ Sort Employees by Salary (Descending)
    @Test
    public void salaryByDesc() {

        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };


        Map<String, Integer> map = new HashMap<>();

        map.put("Akshay", 7657856);
        map.put("Ved", 870944);
        map.put("Anay", 456789);
        map.put("Pratiksha", 9876433);
        map.put("Rutuja", 4356789);

        List<Map.Entry<String, Integer>> ls = new ArrayList<>(map.entrySet());

        Collections.sort(ls, comparator);

        System.out.println(ls);
    }

    //    2️⃣ Sort Products by Price (Ascending)
    @Test
    public void sortByPrice() {

        Comparator<Map.Entry<String, Integer>> com = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };

        Map<String, Integer> map = new HashMap<>();

        map.put("Freeze", 7657856);
        map.put("Washing Machine", 870944);
        map.put("Car", 456789);
        map.put("TV", 9876433);
        map.put("Dryer", 4356789);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, com);

        System.out.println(list);

    }

//    Sort Students by Marks, if marks same sort by name
    @Test
    public void sortByName() {

        Comparator<Map.Entry<String, Integer>> com = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int marks= o1.getValue().compareTo(o2.getValue());

                if(marks==0){
                    return o1.getKey().compareTo(o2.getKey());
                }

                return marks;
            }
        };

        Map<String, Integer> map = new HashMap<>();

        map.put("Akshay", 45);
        map.put("Ved", 45);
        map.put("Anay", 45);
        map.put("Pratiksha", 78);
        map.put("Rutuja", 65);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, com);

        System.out.println(list);
    }

    //    4️⃣ Sort City Names by Length
    @Test
    public void sortByNameLength() {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() == o2.length()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };

        List<String> list = new ArrayList<>();
        list.add("Chennai");
        list.add("Agra");
        list.add("Pondicherry");
        list.add("Mumbai");
        list.add("Kolkata");
        list.add("Surat");

        Collections.sort(list, comparator);

        System.out.println(list);

    }

    //    5️⃣ Sort Orders by Amount and Print Top 2
    @Test
    public void sortTop2ByAmount() {

        Comparator<Map.Entry<String,Integer>> com=new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Map<String, Integer> map = new HashMap<>();

        map.put("Freeze", 2);
        map.put("Washing Machine", 870944);
        map.put("Car", 456789);
        map.put("TV", 1);
        map.put("Dryer", 4356789);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());

        Collections.sort(list,com);

        for (int i = 0; i < Math.min(2,list.size()); i++) {
            System.out.println(list.get(i));
        }
    }
}

