package com.example.dagger2test.scopetest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/23
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface UserScope {
}
