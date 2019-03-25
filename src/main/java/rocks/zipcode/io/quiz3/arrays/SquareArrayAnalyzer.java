package rocks.zipcode.io.quiz3.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        //creat a new array to hold the sqaured values of the input
        Arrays.sort(inputArray);
        Arrays.sort(squaredValues);
    // iterate through the orginal array
        for (int i = 0; i < inputArray.length; i++){
          // multiply the the array by itself and set it = to a varibale
            int square = inputArray[i] * inputArray[i];
            // if statement
            // if square is not = to the squareValues of i
            if (square != squaredValues[i]){
               // return false
                return false;
            }
        }
        // return T
        return true;
    }
}
