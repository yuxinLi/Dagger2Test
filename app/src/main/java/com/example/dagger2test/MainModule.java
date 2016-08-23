package com.example.dagger2test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/18
 */

@Module
public class MainModule {

    String test;

    MainView mainView;
    MainPresenter mainPresenter;

    public MainModule(MainView mainView , MainPresenter mainPresenter){
        this.mainView = mainView;
        this.mainPresenter = mainPresenter;
    }


    @Provides
    public MainView provideMainView(){
        return mainView;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter(){
        return mainPresenter;
    }

    @Provides
    public String provideName(){
        return test;
    }

}
