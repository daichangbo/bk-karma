package com.bk.karma.test;

import java.util.function.Supplier;

/**
 * @author daichangbo
 * @date 2019-12-01 15:22
 * supplier一般可以用于工厂模式
 */
public class SupplierTest {

    public static void main ( String[] args ) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println (supplier.get ());
    }
}
