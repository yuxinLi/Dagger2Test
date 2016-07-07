package com.example.dagger2test;

import android.app.Application;

import com.example.dagger2test.di.components.AppComponent;
import com.example.dagger2test.di.components.DaggerAppComponent;
import com.example.dagger2test.di.modules.AppModule;

/**
 * 作者：lyx on 2016/7/6 15:58
 */
public class App extends Application {


    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
