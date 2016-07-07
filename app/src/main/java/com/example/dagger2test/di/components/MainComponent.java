package com.example.dagger2test.di.components;

import com.example.dagger2test.MainActivity;
import com.example.dagger2test.di.modules.ActivityModule;
import com.example.dagger2test.di.modules.MainModule;
import com.example.dagger2test.di.modules.PoetryModule;
import com.example.dagger2test.di.modules.ProductModule;
import com.example.dagger2test.di.scopes.PerActivity;

import dagger.Component;

/**
 * 作者：lyx on 2016/7/6 15:39
 *
 * MainComponent继承了ActivityComponent，假如ActivityComponent中定义了创建类实例方法，
 * 则MainComponent中必须提供@Inject或@Provides对应的初始化类实例的方法
 */

@PerActivity
@Component(dependencies = AppComponent.class , modules = {MainModule.class , ActivityModule.class , ProductModule.class , PoetryModule.class})
public interface MainComponent extends ActivityComponent{

    void inject(MainActivity mainActivity);

    MainFragmentComponent mainFragmentComponent();

}
