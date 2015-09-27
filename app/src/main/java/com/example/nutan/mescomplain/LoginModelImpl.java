package com.example.nutan.mescomplain;

import android.util.Log;

import rx.Observable;

/**
 * Created by nutan on 9/21/15.
 */
public class LoginModelImpl implements LoginModel {


    @Override
    public Observable<MESServices> authenticate(User userData) {
        MESServices service = new MESServices(null);
        Log.i("check", service.toString());
        return service;
    }
}
