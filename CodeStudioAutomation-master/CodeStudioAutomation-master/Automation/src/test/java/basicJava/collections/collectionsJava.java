package basicJava.collections;

import java.util.*;

/*
Collections are utility class which has it's methods such as shuffle,sort,reverse,reverseOrder
 */
public class collectionsJava {

    public static void main(String[] args) {
        String num = "akshayanilkalamaaallllllllll";

        char[] ch = num.toCharArray();

        Map<Character,Integer> map=new HashMap<>();

        for (char c:ch){
            map.merge(c,1,Integer::sum);
        }
        int max=0;
        char maxChar = 0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
           int count=entry.getValue();

           if(count>max){
               max=count;//max=8
               maxChar= entry.getKey();
           }

        }

        System.out.println(max+"::"+maxChar);
    }
}
