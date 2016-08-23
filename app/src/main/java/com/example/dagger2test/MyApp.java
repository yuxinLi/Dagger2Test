package com.example.dagger2test;

import android.app.Application;

import com.example.dagger2test.scopetest.DaggerUserScopeComponent;
import com.example.dagger2test.scopetest.UserModule;
import com.example.dagger2test.scopetest.UserScopeComponent;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/23
 */
public class MyApp extends Application {


    private UserScopeComponent userScopeComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        userScopeComponent = DaggerUserScopeComponent.builder().userModule(new UserModule()).build();
    }

    public UserScopeComponent getUserScopeComponent() {
        return userScopeComponent;
    }
}
