package com.bk.karma.test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author daichangbo
 * @date 2019-12-01 15:48
 */
public class BinaryOperatorTest {

    public static void main ( String[] args ) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest ();
        System.out.println (binaryOperatorTest.compute ( 1,2,(a,b) -> a + b ));
        System.out.println (binaryOperatorTest.compute ( 1,2,(a,b) -> a - b ));
        System.out.println ("-----------");
        System.out.println (binaryOperatorTest.getShort ( "heall123","world",(a,b) -> a.length () -b.length () ));
        System.out.println (binaryOperatorTest.getShort ( "hello21","world" ,(a,b) -> a.charAt ( 0 ) - b.charAt ( 0 )));

        BigDecimal aa = new BigDecimal ( "1" );
        BigDecimal bb = new BigDecimal ( "2" );
        System.out.println (binaryOperatorTest.compute1 ( aa,bb,(a,b) -> a.add ( b ) ));
    }

    public int compute ( int a , int b, BinaryOperator<Integer> binaryOperator ) {
        return binaryOperator.apply ( a,b );
    }

    public String getShort ( String a, String b, Comparator<String> comparator ) {
        return BinaryOperator.minBy ( comparator ).apply ( a,b );
    }

    public String getMax ( String a, String b, Comparator<String> comparator ) {
        return BinaryOperator.maxBy ( comparator ).apply ( a,b );
    }

    public BigDecimal compute1 ( BigDecimal a , BigDecimal b, BinaryOperator<BigDecimal> binaryOperator ) {
        return binaryOperator.apply ( a,b );
    }
}
