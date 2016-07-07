package com.example.dagger2test.di.components;

import android.content.Context;

import com.example.dagger2test.Navigator;
import com.example.dagger2test.ToastUtil;
import com.example.dagger2test.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 作者：lyx on 2016/7/6 15:31
 */

@Singleton
@Component( modules = {AppModule.class})
public interface AppComponent {

    Context getContext();
    Navigator getNavigator();
    ToastUtil getToastUtils();

}
