package com.example.dagger2test.di.modules;

import com.example.dagger2test.data.GetUserData;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：lyx on 2016/7/6 15:18
 */
@Module
public class MainModule {

    @Provides
    public GetUserData provideUserData(){
        return new GetUserData();
    }
}
