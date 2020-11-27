package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IntegerStorage integerStorage = new IntegerStorage(Arrays.asList(999,32,555,1,3232,4343,2,43424243,0));
        integerStorage.sort();
        System.out.println();
        StringStorage stringStorage = new StringStorage(Arrays.asList("Badsdsad","Zsdadisid","Kdsiandjsa","bdsadsa","adsfsdf","fffsadsad","ccccssadsad","AAaadsadsad"));
        stringStorage.sort();
        System.out.println();
        DoubleStorage doubleStorage = new DoubleStorage(new Double[]{5.0,11.0,1.0,0.5,99.5,0.1});
        doubleStorage.sort();
    }
}
