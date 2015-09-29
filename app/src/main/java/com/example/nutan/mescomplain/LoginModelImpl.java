package com.example.nutan.mescomplain;

import android.util.Log;

import rx.Observable;

/**
 * Created by nutan on 9/21/15.
 */
public class LoginModelImpl implements LoginModel {

    private MESServices service;
    public LoginModelImpl(MESServices service){
        this.service=service;
    }
    @Override
    public Observable<Boolean> authenticate(User userData) {
        Log.i("authenticate","verify");
        return service.userSignIn(userData).map(response -> response.getStatus()== 200);
    }
}
