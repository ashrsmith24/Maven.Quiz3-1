package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType type : array) {
            if (getNumberOfOccurrences(type) % 2 == 1) {
                return type;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType type : array){
            if (getNumberOfOccurrences(type) % 2 ==0){
                return type;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
       int count =0;
       for (SomeType type : array){
           if (valueToEvaluate.equals(type)){
               count++;
           }
       }
       return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> filtered = new ArrayList<>();
        for (SomeType type : array){
            if (predicate.apply(type)){
                filtered.add(type);
            }
        }
        SomeType[] newArr = Arrays.copyOf(array, filtered.size());

        return filtered.toArray(newArr);
    }
}
