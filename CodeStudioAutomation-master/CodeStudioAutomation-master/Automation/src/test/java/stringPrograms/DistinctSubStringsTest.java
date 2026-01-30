package stringPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DistinctSubStringsTest {

    @Test
    public void test(){
        String str = "geeksforgeeks";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        boolean[] visited = new boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {

            if(visited[i]){
                continue;
            }

            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    visited[j]=true;
                }
            }

            System.out.println(list.get(i));
        }

    }
}
