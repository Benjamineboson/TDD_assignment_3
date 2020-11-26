package org.example;

import java.util.List;

public class IntegerStorage extends XSort<Integer> {


    private List<Integer> integerList;

    public IntegerStorage(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    List<Integer> getList() {
        return integerList;
    }

    @Override
    boolean isLargerThan(Integer a, Integer b) {
        return a > b;
    }

    @Override
    void printSortedList(List<Integer> list) {
        for (Integer i:list) {
            System.out.print("["+i+"] ");
        }
    }
}
