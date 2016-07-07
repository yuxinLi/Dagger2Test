package com.example.dagger2test.presenter;

import com.example.dagger2test.data.GetUserData;
import com.example.dagger2test.data.UserData;

import javax.inject.Inject;

/**
 * 作者：lyx on 2016/7/6 15:55
 */
public class MainPresenter {

    public GetUserData mUserData;
    private IUserView mUserView;

    @Inject
    public MainPresenter(GetUserData mUserData) {
        this.mUserData = mUserData;
    }

    public void getUser(){
        UserData userData = this.mUserData.getUser();
        this.mUserView.setUserName(userData.mUserName);
    }

    public void setUserView(IUserView userView){
        this.mUserView = userView;
    }

    public static interface IUserView{
        void setUserName(String name);
    }
}
