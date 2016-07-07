package com.example.dagger2test.di.components;

import com.example.dagger2test.di.scopes.PerActivity;
import com.example.dagger2test.view.MainFragment;

import dagger.Subcomponent;

/**
 * 作者：lyx on 2016/7/6 15:48
 */

@PerActivity
@Subcomponent
public interface MainFragmentComponent {

    void inject(MainFragment mainFragment);
}
