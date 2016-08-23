package com.example.dagger2test.scopetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.dagger2test.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CActivity extends AppCompatActivity {

    @BindView(R.id.tv_singleton)
    TextView tv_singleton;

    @BindView(R.id.tv_userscope1)
    TextView tv_userscope1;

    @BindView(R.id.tv_userscope2)
    TextView tv_userscope2;

    @Inject
    User user1;
    @Inject
    User user2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        ButterKnife.bind(this);

        DaggerUserScopeComponentC.builder().userModuleC(new UserModuleC()).build().inject(this);

        tv_userscope1.setText(user1.toString());
        tv_userscope2.setText(user2.toString());

    }

}
