package com.example.dagger2test;

import dagger.Module;
import dagger.Provides;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/18
 */

@Module
public class MainModule {

    MainView mainView;

    public MainModule(MainView mainView){
        this.mainView = mainView;
    }


    @Provides
    public MainView provideMainView(){
        return mainView;
    }

}
