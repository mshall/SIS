package com.sis.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sis.R;
import com.sis.network.App;

import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        ((App) getApplication()).getNetComponent().inject(this);
    }
}
