package stringPrograms.sortingOfArray.ComparableVsComparator;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortByPrice implements Comparable<SortByPrice>{

    String product;
    int price;

    SortByPrice(String product,int price){
        this.price=price;
        this.product=product;
    }
    @Override
    public int compareTo(SortByPrice o) {
        int price=Integer.compare(this.price,o.price);
        if(price==0){
            return this.product.compareTo(o.product);
        }

        return price;
    }

    @Override
    public String toString() {
        return product+ "::" +price;
    }
}

public class SortByPriceTest {

    @Test
    public void test() {

        //    2️⃣ Sort Products by Price (Ascending)

        List<SortByPrice> map=new ArrayList<>();
        map.add(new SortByPrice("Freeze", 4));
        map.add(new SortByPrice("Washing Machine", 2));
        map.add(new SortByPrice("Car", 5));
        map.add(new SortByPrice("TV", 1));
        map.add(new SortByPrice("Dryer", 3));

        Collections.sort(map);

        System.out.println(map);

    }

}
