package com.example.nutan.mescomplain;

import android.media.browse.MediaBrowser;

import rx.Observable;

/**
 * Created by nutan on 9/21/15.
 */
public interface LoginView {
    Observable<User> onLogin();

    void loginResponse(Boolean status);
}
