package com.example.nutan.mescomplain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ComplainRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_register);

        new ComplainRegisterPresenter(complainRegisterView(),complainRegisterModel());
    }

    private ComplainRegisterModel complainRegisterModel() {
        return null;
    }

    private ComplainRegisterView complainRegisterView() {
        return (ComplainRegisterView) getSupportFragmentManager().findFragmentById(R.id.complain_register_fragment);
    }

}
