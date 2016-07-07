package com.example.dagger2test.di.modules;

import android.app.Activity;

import com.example.dagger2test.di.scopes.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：lyx on 2016/7/6 15:16
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity(){
        return activity;
    }
}
