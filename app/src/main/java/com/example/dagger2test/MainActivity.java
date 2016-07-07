package com.example.dagger2test;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dagger2test.data.Poetry;
import com.example.dagger2test.di.components.DaggerMainComponent;
import com.example.dagger2test.di.components.MainComponent;
import com.example.dagger2test.di.modules.ActivityModule;
import com.example.dagger2test.di.modules.MainModule;
import com.example.dagger2test.view.BaseActivity;
import com.example.dagger2test.view.MainFragment;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainFragment.OnFragmentInteractionListener{

    private MainComponent mMainComponent;

    @Inject
    Poetry p1;

    @Inject
    Poetry p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainComponent = DaggerMainComponent.builder().appComponent(getAppComponent())
                .mainModule(new MainModule())
                .activityModule(new ActivityModule(this)).build();

        mMainComponent.inject(this);


        ((TextView)findViewById(R.id.tv1)).setText(p1.getPemo()+ " , "+p1);
        ((TextView)findViewById(R.id.tv2)).setText(p2.getPemo()+ " , "+p2);
    }


    public MainComponent getmMainComponent() {
        return mMainComponent;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
