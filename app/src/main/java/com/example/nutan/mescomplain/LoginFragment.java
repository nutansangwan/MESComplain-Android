package com.example.nutan.mescomplain;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import rx.Observable;
import rx.subjects.BehaviorSubject;

import android.support.v4.app.Fragment;

/**
 * Created by nutan on 9/21/15.
 */
public class LoginFragment extends Fragment implements LoginView, View.OnClickListener {

    Button login, cancel;
    EditText userName, password;
    BehaviorSubject<User> userData = BehaviorSubject.create();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setRetainInstance(true);
        Log.i("check", "onCreateView");
        return inflater.inflate(R.layout.login_fragment, container);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i("check", "onViewCreated");
        initializeViews(view);
        defaultConfiguration();
        setEventsForViews();
    }

    private void setEventsForViews() {
        login.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    private void defaultConfiguration() {

    }

    private void initializeViews(View view) {

        login = (Button) view.findViewById(R.id.login);
        cancel = (Button) view.findViewById(R.id.cancel);
        userName = (EditText) view.findViewById(R.id.user_name);
        password = (EditText) view.findViewById(R.id.password);
    }

    @Override
    public Observable<User> onLogin() {
        Log.i("check", "asObservable set hoo gya");
        return userData.asObservable();
    }

    @Override
    public void loginResponse(User service) {
        Navigator.toComplainRegisterActivity(getActivity());
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login) {
            User user = new User();
            user.setUserName(String.valueOf(userName.getText()));
            user.setPassword(String.valueOf(password.getText()));
            Log.i("check", user.getUserName());
            userData.onNext(user);
        }


    }
}
