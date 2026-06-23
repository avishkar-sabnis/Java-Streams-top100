package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfAll_Integers {

    public static void main(String[] args) {

        int[] arr = {19,12,14,10,12,34};

        List<String> stringList = Arrays.asList("abp","fko","zxy","jjo");
        List<String> list = stringList.stream().sorted(Comparator.comparing(String::toString)).limit(2).toList();
        System.out.println(list);



        int[] sortInAscending = Arrays.stream(arr).boxed()
                .sorted(Comparator.comparingInt((x-> (int) x)))
                .mapToInt(Integer::intValue).toArray();
        for(int rem:sortInAscending){
            System.out.print(rem+" ");
        }

        long removeDuplicateIntegersAndGetCount = Arrays.stream(Arrays.stream(arr).
                distinct().toArray()).count();
        System.out.println(removeDuplicateIntegersAndGetCount);

        int[] removeDuplicateIntegers = Arrays.stream(arr).
                distinct().toArray();
        for(int rem:removeDuplicateIntegers){
            System.out.print(rem+" ");
        }
        int listOfEvenNumbers = Arrays.stream(arr).
                reduce((x,y)->x+y).getAsInt();
        System.out.println(listOfEvenNumbers);


    }

}
