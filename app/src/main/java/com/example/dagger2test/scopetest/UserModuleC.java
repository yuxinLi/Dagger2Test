package com.example.dagger2test.scopetest;

import dagger.Module;
import dagger.Provides;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/23
 */

@Module
public class UserModuleC {

    @Provides
    public User provideUser(){
        return new User();
    }
}
