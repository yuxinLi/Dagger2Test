package com.example.dagger2test.data;

import javax.inject.Inject;

/**
 * 作者：lyx on 2016/7/6 15:03
 */
public class GetUserData {

    @Inject
    public GetUserData() {
    }

    public UserData getUser(){
        UserData data = new UserData();
        data.mUserName = "lyx";
        return data;
    }
}
