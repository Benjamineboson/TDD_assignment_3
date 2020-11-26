package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class XSort<T> {
    abstract List<T> getList();
    abstract boolean isLargerThan(T a, T b);
    abstract void printSortedList(List<T> list);

    /**
     * Make even more abstract - move away from List<>
     *     Use:
     *          getNextAscending():T
     *          getNextDescending():T
     */

    public void sort() {
        List<T> listA = getList();
        for (int i = 0; i < listA.size(); i++) {
            for (int j = listA.size() - 1; j > i; j--) {
                if (isLargerThan(listA.get(i), listA.get(j))) {
                    T temp = listA.get(j);
                    listA.set(j, listA.get(i));
                    listA.set(i, temp);
                }
            }
        }
        printSortedList(listA);
    }
}
