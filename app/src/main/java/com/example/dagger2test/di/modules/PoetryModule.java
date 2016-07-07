package com.example.dagger2test.di.modules;

import com.example.dagger2test.data.Poetry;
import com.example.dagger2test.di.scopes.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：lyx on 2016/7/7 16:18
 */
@Module
public class PoetryModule {

    @Provides
    @PerActivity
    Poetry providePoetry(){
        return new Poetry();
    }
}
