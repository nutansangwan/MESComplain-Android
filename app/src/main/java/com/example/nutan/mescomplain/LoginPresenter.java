package com.example.nutan.mescomplain;

/**
 * Created by nutan on 9/21/15.
 */
public class LoginPresenter {

    LoginPresenter(LoginView view, LoginModel model) {
//        view.onLogin().subscribe(userData -> view.loginResponse(userData));
        view.onLogin().subscribe(userData -> model.authenticate(userData)
                .subscribe(status -> view.loginResponse(status)));
    }
}
