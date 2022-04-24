package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compareTo;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(53);
        list.add(5);
        list.add(23);
        list.add(11);
        list.add(56);
        list.add(30);
        list.add(1);
        list.add(24);
        list.add(53);
        list.add(5);
        list.add(23);
        list.add(11);
        list.add(56);
        list.add(30);
        list.add(1);
        list.add(24);

        ShakerSort<Integer> shakerSort = new ShakerSort<>(comparator);

        list = shakerSort.sort(list);

        System.out.println(list);
    }
}
