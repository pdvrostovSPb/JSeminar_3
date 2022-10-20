package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {

    // Дан список с десятью случайными числами, нужно отсортировать
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(t1.sortByCollections(list));
        System.out.println(t1.sortByComparator(list));


    }

    public List<Integer> sortByCollections(List<Integer> list){
        Collections.sort(list);

        return list;
    }

    public List<Integer> sortByComparator(List<Integer> list){
        Collections.sort(list, Comparator.reverseOrder());



        return list;

}
