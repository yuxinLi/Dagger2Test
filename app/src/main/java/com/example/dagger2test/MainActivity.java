package com.example.dagger2test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dagger2test.scopetest.AActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder().mainModule(new MainModule(this , new MainPresenter(this))).build().inject(this);

        presenter.loadData();
    }


    @Override
    public void updateUI() {
        ((TextView)findViewById(R.id.tv)).setText("xxx");
    }


    public void goToScopeTest(View v){
        startActivity(new Intent(this , AActivity.class));
    }
}
