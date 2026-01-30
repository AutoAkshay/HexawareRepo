package stringPrograms.lamdaExpressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapLambda {

    public static void main(String[] args) {
        String str="Anil Kalam Akshay Anil Kalam Akshay ";

        String[] split=str.split("\\s+");
        Map<String,Integer> map=new HashMap<>();
        Arrays.stream(split).forEach(name-> map.put(name,map.getOrDefault(name,0)+1));

        map.entrySet().forEach(entry-> System.out.println(entry.getKey()+"::"+entry.getValue()));
    }
}
