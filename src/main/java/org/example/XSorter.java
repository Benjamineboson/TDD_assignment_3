package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class XSorter<T> {
    abstract boolean hasMore();
    abstract T getNext();
    abstract T getFirstValue();
    abstract T[] getArrayType();
    abstract boolean isLargerThan(T a, T b);

    public List<T> sort(){
        T[] sortedArray = getArrayType();
        while (hasMore()){
            T firstValue = getFirstValue();
            T nextValue = getNext();
//            for (T value:
//                 ) {
//
//            }
            if (isLargerThan(firstValue,nextValue)){
                T temp = firstValue;
                firstValue = nextValue;
                nextValue = temp;
            }
        }
    }
}
