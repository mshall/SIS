package com.sis.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sis.MainActivity;
import com.sis.R;
import com.sis.network.App;
import com.sis.network.Controller;
import com.sis.pojo.Response;
import com.sis.util.Constants;
import com.sis.util.misc.SharedPreferencesUtils;
import com.sis.util.ui.Validator;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {
    @Inject
    Retrofit retrofit;

    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.bLogin)
    Button bLogin;
    ArrayList<EditText> formFields;

    public static String username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        ((App) getApplication()).getNetComponent().inject(this);
        formFields = new ArrayList<>();
        formFields.add(etUsername);
        formFields.add(etPassword);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activateLogin();
            }
        });
    }

    private void activateLogin() {
        if (new Validator().isValidForm(this, formFields)) {
            Call<Response> response = retrofit.create(Controller.class).loginUser(etUsername.getText().toString(), etPassword.getText().toString());

            Log.e("Login URL:", response.request().url().toString());
            response.enqueue(new Callback<Response>() {
                @Override
                public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                    String responseString = response.body().getResponse();
                    if (responseString.equalsIgnoreCase("success")) {
                        username = etUsername.getText().toString();
                        SharedPreferencesUtils.saveStringToSharedPreferences(LoginActivity.this, Constants.USERNAME, etUsername.getText().toString());
                        SharedPreferencesUtils.saveStringToSharedPreferences(LoginActivity.this, Constants.PASSWORD, etPassword.getText().toString());
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }
                }

                @Override
                public void onFailure(Call<Response> call, Throwable throwable) {

                }
            });
        }
    }
}
