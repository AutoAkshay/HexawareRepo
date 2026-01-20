package stringPrograms.sortingOfArray;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class ThirdLargestSmallestValueTest {

//    Third smallest: 30
//    Third largest: 32
//    Fourth smallest: 31
//    Fourth largest: 31

    @Test
    public void sortingThirdLargest(){
//        Third largest: 32
       Integer[] arr = {32, 28, 35, 29, 30, 31, 34, 34 , 32};

        Arrays.sort(arr);

        for (int i:arr){
            System.out.print(i+",");
        }

        System.out.println();

        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;

        for (int i : arr) {
            if(i > firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=i;
            }

            else if(firstMax > i && secondMax < i ){
                thirdMax=secondMax;
                secondMax=i;
            }

            else if(thirdMax < i && secondMax > i){
                thirdMax=i;
            }
        }

        System.out.println("Third Largest value:: "+thirdMax);
    }

    @Test
    public void sortingThirdSmallest(){
//        Third smallest: 30
        Integer[] arr = {32, 28, 35, 29, 30, 31, 34, 34 , 32};

        Arrays.sort(arr);

        for (int i:arr){
            System.out.print(i);
        }

        System.out.println();

        int firstMax=Integer.MAX_VALUE;
        int secondMax= Integer.MAX_VALUE;
        int thirdMax=Integer.MAX_VALUE;

        for (int i : arr) {
            if(i < firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=i;
            }

            else if(firstMax < i && secondMax > i ){
                thirdMax=secondMax;
                secondMax=i;
            }

            else if(thirdMax > i && secondMax < i){
                thirdMax=i;
            }
        }

        System.out.println("Third Largest value:: "+thirdMax);
    }
}
