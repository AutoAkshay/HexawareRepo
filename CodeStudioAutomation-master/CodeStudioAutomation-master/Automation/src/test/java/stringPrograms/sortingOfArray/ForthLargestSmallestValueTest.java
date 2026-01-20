package stringPrograms.sortingOfArray;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ForthLargestSmallestValueTest {

//    Third smallest: 30
//    Third largest: 32
//    Fourth smallest: 31
//    Fourth largest: 31

    @Test
    public void sortingThirdLargest(){
//        Third largest: 32
       Integer[] arr = {32, 28, 35, 29, 30, 31, 34, 34 , 32, 33 };


        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        int forthMax=Integer.MIN_VALUE;

        for (int i:arr){
            if(i>firstMax){
                forthMax=thirdMax;
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=i;
            }

            else if(secondMax < i && firstMax > i ){
                forthMax=thirdMax;
                thirdMax=secondMax;
                secondMax=i;
            }

            else if(thirdMax < i && secondMax > i){
                forthMax=thirdMax;
                thirdMax=i;
            }

            else if (forthMax<i && thirdMax>i) {
                forthMax=i;
            }
        }

        System.out.println(forthMax);
    }

    @Test
    public void sortingForthSmallest() {
//        Third smallest: 30
        Integer[] arr = {32, 28, 35, 29, 30, 31, 34, 34, 32, 36, 27};

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print(i);
        }

        System.out.println();

        int firstMin = Integer.MAX_VALUE;
        int secondMin =  Integer.MAX_VALUE;
        int thirdMin =  Integer.MAX_VALUE;
        int forthMin =  Integer.MAX_VALUE;

        for (int i:arr){
            if(firstMin > i){
                forthMin=thirdMin;
                thirdMin=secondMin;
                secondMin=firstMin;
                firstMin=i;
            }

            else if (secondMin > i && firstMin < i){
                forthMin=thirdMin;
                thirdMin=secondMin;
                secondMin=i;
            }

            else if (thirdMin > i && secondMin < i) {
                forthMin=thirdMin;
                thirdMin=i;

            }

            else if (forthMin > i && thirdMin < i) {
                forthMin=i;
            }
        }

        System.out.println(forthMin);
    }
}
