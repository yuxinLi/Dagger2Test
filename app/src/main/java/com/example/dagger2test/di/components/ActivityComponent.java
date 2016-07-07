package com.example.dagger2test.di.components;

import android.app.Activity;

import com.example.dagger2test.di.modules.ActivityModule;
import com.example.dagger2test.di.scopes.PerActivity;

import dagger.Component;

/**
 * 作者：lyx on 2016/7/6 15:28
 */
@PerActivity
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {

    Activity getActivity();
}
