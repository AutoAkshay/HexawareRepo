package stringPrograms.sortingOfArray;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class MultipleArraySorting {

    @Test
    public void multiArraySmallest(){
        Integer[] num1={1,3,5,7,9,11,13};
        Integer[] num2={2,4,6,8,10};

        Integer[] combined=Stream.concat(Arrays.stream(num1),Arrays.stream(num2)).toArray(Integer[]::new);

        int firstLargest=Integer.MAX_VALUE;
        int secondLargest=Integer.MAX_VALUE;
        int thirdLargest=Integer.MAX_VALUE;

        for (int i:combined) {
            if(i < firstLargest ){
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=i;
            }

            else if(secondLargest > i && firstLargest < i){
                thirdLargest=secondLargest;
                secondLargest=i;
            }

            else if (thirdLargest > i && secondLargest < i) {
                thirdLargest=i;
            }


        }

        System.out.println("Third smallest number:: "+thirdLargest);
    }

    @Test
    public void multiArrayLargest(){
        Integer[] num1={1,3,5,7,9,11,13};
        Integer[] num2={2,4,6,8,10};

        Integer[] combined=Stream.concat(Arrays.stream(num1),Arrays.stream(num2)).toArray(Integer[]::new);

        int firstMin=Integer.MIN_VALUE;
        int secondMin=Integer.MIN_VALUE;
        int thirdMin=Integer.MIN_VALUE;

        for (int i:combined){
            if(i>firstMin){
                thirdMin=secondMin;
                secondMin=firstMin;
                firstMin=i;
            }

            else if (i > secondMin && firstMin > i) {
                thirdMin=secondMin;
                secondMin=i;
            }

            else if (i > thirdMin && secondMin > i) {
                thirdMin=i;
            }
        }

        System.out.println("Third max number ::"+thirdMin);

    }
}
