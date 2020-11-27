package org.example;

import java.util.List;

public class StringStorage extends XSort<String> {

    List<String> stringList;

    public StringStorage(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    boolean isLargerThan(String a, String b) {
        return a.toLowerCase().charAt(0) > b.toLowerCase().charAt(0);
    }

    @Override
    void printSortedContainer() {
        for (String s:stringList) {
            System.out.print("["+s+"] ");
        }
    }

    @Override
    String getContainerItem(int index) {
        return stringList.get(index);
    }

    @Override
    void setContainerItem(int index, String s) {
        stringList.set(index,s);
    }

    @Override
    int containerSize() {
        return stringList.size();
    }
}
