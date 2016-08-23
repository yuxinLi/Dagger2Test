package com.example.dagger2test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/18
 */

@Singleton
@Component(
        modules = {MainModule.class}
)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
