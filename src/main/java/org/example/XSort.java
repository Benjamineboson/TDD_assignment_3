package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class XSort<T> {
    abstract boolean isLargerThan(T a, T b);
    abstract void printSortedContainer();
    abstract T getContainerItem(int index);
    abstract void setContainerItem(int index, T t);
    abstract int containerSize();


    public void sort() {
        for (int i = 0; i < containerSize(); i++) {
            for (int j = containerSize() - 1; j > i; j--) {
                if (isLargerThan(getContainerItem(i), getContainerItem(j))) {
                    T temp = getContainerItem(i);
                    setContainerItem(i,getContainerItem(j));
                    setContainerItem(j,temp);
                }
            }
        }
        printSortedContainer();
    }
}
