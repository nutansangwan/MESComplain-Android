package com.example.nutan.mescomplain;

import android.util.Log;

import rx.Observable;

/**
 * Created by nutan on 9/21/15.
 */
public class LoginModelImpl implements LoginModel {


    @Override
    public Observable<MESService> authenticate(User userData) {
        MESService service = new MESService(null);
        Log.i("check", service.toString());
        return service;
    }
}
