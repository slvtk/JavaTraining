package codewars.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> newList = list.stream().map(x->x+10).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(newList);
    }
}


