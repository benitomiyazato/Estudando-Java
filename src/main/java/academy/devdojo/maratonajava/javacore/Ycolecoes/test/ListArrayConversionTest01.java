package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        Integer[] integers = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

        Integer[] numsArray = new Integer[3];
        numsArray[0] = 1;
        numsArray[1] = 2;
        numsArray[2] = 3;

        List<Integer> integerList = new ArrayList<>(Arrays.asList(numsArray)); // Arrays.asList linka o Array e a List
        System.out.println(integerList);
    }
}
