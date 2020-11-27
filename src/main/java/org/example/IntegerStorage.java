package org.example;

import java.util.List;

public class IntegerStorage extends XSort<Integer> {


    private List<Integer> integerList;

    public IntegerStorage(List<Integer> integerList) {
        this.integerList = integerList;
    }


    @Override
    boolean isLargerThan(Integer a, Integer b) {
        return a > b;
    }

    @Override
    void printSortedContainer() {
        for (Integer i:integerList) {
            System.out.print("["+i+"] ");
        }
    }

    @Override
    Integer getContainerItem(int index) {
        return integerList.get(index);
    }

    @Override
    void setContainerItem(int index, Integer integer) {
        integerList.set(index,integer);
    }

    @Override
    int containerSize() {
        return integerList.size();
    }
}
