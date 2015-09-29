package com.example.nutan.mescomplain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

//import retrofit.Retrofit;
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i("check", "activity initialized");
        new LoginPresenter(loginView(), loginModel());
    }

    private LoginModelImpl loginModel() {
        Log.i("model","activity");
       return new LoginModelImpl( new RestAdapter.Builder()
               .setConverter(new GsonConverter(namingPolicyGsonBuilder().create()))
               .setEndpoint("http://192.168.144.224:3000/").setLogLevel(RestAdapter.LogLevel.FULL).build().create(MESServices.class));


    }

    private static GsonBuilder namingPolicyGsonBuilder() {
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
    }


    private LoginView loginView() {
        return (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.login_fragment);
    }
}
