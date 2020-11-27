package org.example;

public class DoubleStorage extends XSort<Double> {

    private Double[] doubleArray;

    public DoubleStorage(Double[] doubleArray) {
        this.doubleArray = doubleArray;
    }

    @Override
    boolean isLargerThan(Double a, Double b) {
        return a>b;
    }

    @Override
    void printSortedContainer() {
        for (Double d:doubleArray) {
            System.out.print("["+d+"]");
        }
    }

    @Override
    Double getContainerItem(int index) {
        return doubleArray[index];
    }

    @Override
    void setContainerItem(int index, Double aDouble) {
        doubleArray[index] = aDouble;
    }

    @Override
    int containerSize() {
        return doubleArray.length;
    }
}
