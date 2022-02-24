package lesson7;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayRunner {
    public static void main(String[] args) {
        Integer[] nums = {78, 65, 125, 11};//Задание массива с классом оболочкой "int".
        Arrays.sort(nums);//Операция сортировки.
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, Comparator.reverseOrder());//Привер сортировки в обратном порядке.
        System.out.println(Arrays.toString(nums));
        System.out.println(summa(1, 2));
    }

    public static int summa(int arg1, int arg2) {//Пример процедурного подхода
        return arg1 + arg2;
    }
}
