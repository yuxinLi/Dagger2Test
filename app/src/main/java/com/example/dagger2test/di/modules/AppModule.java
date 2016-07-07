package com.example.dagger2test.di.modules;

import android.content.Context;

import com.example.dagger2test.Navigator;
import com.example.dagger2test.ToastUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：lyx on 2016/7/6 15:20
 */
@Module
public class AppModule {

    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    public Navigator provideNavgator(){
        return new Navigator();
    }


    @Provides
    @Singleton
    public ToastUtil provideToastUtils(){
        return new ToastUtil(context);
    }


}
