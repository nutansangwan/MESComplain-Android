package com.example.nutan.mescomplain;

import rx.Observable;

/**
 * Created by nutan on 9/21/15.
 */
public interface LoginModel {
    Observable<MESServices> authenticate(User userData);
}
