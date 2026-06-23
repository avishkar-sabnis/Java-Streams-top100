package src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {

        int[] arr = {19,12,14,10,22};

        List<Integer> listOfEvenNumbers = Arrays.stream(arr)
                                        .filter(x->x%2==0)
                                        .boxed().toList();
        System.out.println(listOfEvenNumbers);


    }

}
