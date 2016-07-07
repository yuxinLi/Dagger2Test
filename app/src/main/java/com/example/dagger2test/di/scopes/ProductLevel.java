package com.example.dagger2test.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 作者：lyx on 2016/7/6 17:43
 */

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ProductLevel {

    String value() default "";
}
