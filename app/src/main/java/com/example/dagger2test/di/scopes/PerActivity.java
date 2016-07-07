package com.example.dagger2test.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 作者：lyx on 2016/7/6 15:13
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
