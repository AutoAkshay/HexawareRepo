package stringPrograms.sortingOfArray;

import org.testng.annotations.Test;

public class SecondLargestSmallestValueTest {

//    Third smallest: 30
//    Third largest: 32
//    Fourth smallest: 31
//    Fourth largest: 31

    @Test
    public void sortingSecondLargest(){
//        Second largest: 34
        Integer[] arr = {32, 28, 35, 29, 30, 31, 34, 34, 32};

        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for (int i : arr) {
            if(i > firstMax){
                secondMax=firstMax;
                firstMax=i;
            }

            else if(firstMax > i && secondMax < i ){
                secondMax=i;
            }
        }

        System.out.println(secondMax);
    }

    @Test
    public void sortingSecondSmallest(){
//        Second smallest: 29

        Integer[] arr = {32, 28, 35, 29, 30, 31, 34, 34 , 32};

        int firstMin=Integer.MAX_VALUE;//2.1 Billion
        int secondMin=Integer.MAX_VALUE;//2.1 Billion


        for (int i : arr) {
            if(i < firstMin){
                secondMin=firstMin;
                firstMin=i;
            }

            else if(i < secondMin && i > firstMin){
                secondMin=i;
            }
        }

        System.out.println(secondMin);
    }
}
