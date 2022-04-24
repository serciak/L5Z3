package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class ShakerSort<T> {

    private Comparator<T> comparator;

    public ShakerSort(Comparator<T> comparator){
        this.comparator = comparator;
    }

    public ArrayList<T> sort(ArrayList<T> list) {
        int size = list.size();
        int leftEnd = 0;
        int rightEnd = size;
        int lastSwap = -1;
        boolean swapped = true;

        while(leftEnd != rightEnd && swapped) {
            leftEnd++;
            --rightEnd;
            swapped = false;

            if(lastSwap > 0 && lastSwap > leftEnd) {
                leftEnd = lastSwap;
            }

            for(int i = leftEnd-1; i < rightEnd; i++) {
                if(comparator.compare(list.get(i), list.get(i+1)) > 0) {
                        T temp = list.get(i);
                        list.set(i, list.get(i+1));
                        list.set(i+1, temp);
                        lastSwap = i+1;
                        swapped = true;
                }
            }

            if(lastSwap > 0 && lastSwap < rightEnd) {
                rightEnd = lastSwap;
            }

            for(int i = rightEnd; i > leftEnd-1; --i) {
                if(comparator.compare(list.get(i-1), list.get(i)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(i-1));
                    list.set(i-1, temp);
                    lastSwap = i-1;
                    swapped = true;
                }
            }
        }
        return list;
    }

}
