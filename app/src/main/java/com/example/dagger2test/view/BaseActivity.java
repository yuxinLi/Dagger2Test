package com.example.dagger2test.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dagger2test.App;
import com.example.dagger2test.di.components.AppComponent;

/**
 * 作者：lyx on 2016/7/6 16:04
 */
public class BaseActivity extends AppCompatActivity {


    public AppComponent getAppComponent(){
        return ((App)getApplication()).getAppComponent();
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
