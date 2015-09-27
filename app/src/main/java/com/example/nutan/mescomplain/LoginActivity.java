package com.example.nutan.mescomplain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
//import retrofit.RestAdapter;

import retrofit.Retrofit;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i("check", "activity initialized");
        new LoginPresenter(loginView(), loginModel());
    }

    private LoginModel loginModel() {

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://192.168.144.224:3000")
//                .build();
//            return RestAdapterBuilderFactory
    return null;
    }

    private LoginView loginView() {
        return (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.login_fragment);
    }
}
