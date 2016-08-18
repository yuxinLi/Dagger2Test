package com.example.dagger2test;

import javax.inject.Inject;

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2016/8/18
 */
public class MainPresenter {

    MainView mainView;

    @Inject
    public MainPresenter(MainView mainView){
        this.mainView = mainView;
    }

    public void loadData(){
        // ...网络操作
        mainView.updateUI();
    }
}
