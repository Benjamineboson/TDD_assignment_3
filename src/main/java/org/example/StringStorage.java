package org.example;

import java.util.List;

public class StringStorage extends XSort<String> {

    List<String> stringList;

    public StringStorage(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    List<String> getList() {
        return stringList;
    }

    @Override
    boolean isLargerThan(String a, String b) {
        return a.toLowerCase().charAt(0) > b.toLowerCase().charAt(0);
    }

    @Override
    void printSortedList(List<String> list) {
        for (String s:list) {
            System.out.print("["+s+"] ");
        }
    }
}
