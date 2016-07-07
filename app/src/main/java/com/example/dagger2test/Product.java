package com.example.dagger2test;

import javax.inject.Inject;

/**
 * 作者：lyx on 2016/7/6 17:45
 */
public class Product {

    public String s;

    @Inject
    public Product(String s) {
        this.s = s;
    }
}
