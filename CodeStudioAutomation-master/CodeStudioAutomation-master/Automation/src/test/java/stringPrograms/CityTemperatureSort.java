package stringPrograms;
import org.testng.annotations.Test;

import java.util.*;
public class CityTemperatureSort {

    @Test
    public void sorting() {

        Map<String, Integer> map = new HashMap<>();

        map.put("Pune", 32);
        map.put("Surat", 28);
        map.put("Chennai", 27);
        map.put("Delhi", 30);
        map.put("Kolkata", 31);

        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;

        String firstCity=null;
        String secondCity=null;

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()<firstMin){
               secondMin=firstMin;
               firstMin=entry.getValue();

               secondCity=firstCity;
               firstCity=entry.getKey();
            }

            else if (secondMin > entry.getValue() && firstMin < entry.getValue()) {
                secondMin=entry.getValue();
                secondCity=entry.getKey();
            }
        }

        System.out.println(secondMin+"::"+secondCity);

    }
}
