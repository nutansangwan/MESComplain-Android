package com.example.nutan.mescomplain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i("check", "activity initialized");
        new LoginPresenter(loginView(), loginModel());
    }

    private LoginModel loginModel() {
        return null;
    }

    private LoginView loginView() {
        return (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.login_fragment);
    }
}
