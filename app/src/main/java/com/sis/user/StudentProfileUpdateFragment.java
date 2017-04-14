package com.sis.user;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sis.MainActivity;
import com.sis.R;
import com.sis.network.App;
import com.sis.network.Controller;
import com.sis.pojo.Profile;
import com.sis.pojo.Response;
import com.sis.util.Constants;
import com.sis.util.fragment.FragmentUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentProfileUpdateFragment extends Fragment {

    public static final String TAG = StudentProfileUpdateFragment.class.getName();
    @Inject
    Retrofit retrofit;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etName)
    EditText etName;
    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.etAddress)
    EditText etAddress;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.bUpdate)
    Button bUpdate;
    View view;

    public static Profile profile;
    MainActivity activity;

    public StudentProfileUpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_student_profile_update, container, false);
        ButterKnife.bind(this, view);
        ((App) activity.getApplication()).getNetComponent().inject(this);
        initializeViews();
        bUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateUserProfile();
            }


        });
        return view;
    }

    private void initializeViews() {
        activity.toolbar.setTitle(getString(R.string.update_my_profile));
        if (getArguments() != null)
            profile = (Profile) getArguments().getSerializable(Constants.PROFILE);
        if (profile.getName().isEmpty()) profile.setName(" ");
        if (profile.getPhone().isEmpty()) profile.setPhone(" ");
        if (profile.getUser_email().isEmpty()) profile.setUser_email(" ");
        if (profile.getAddress().isEmpty()) profile.setAddress(" ");

        etName.setText(profile.getName());
        etEmail.setText(profile.getUser_email());
        etPhone.setText(profile.getPhone());
        etAddress.setText(profile.getAddress());
    }

    private void updateUserProfile() {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String phone = etPhone.getText().toString();
        String address = etAddress.getText().toString();
        String password = etPassword.getText().toString();
        Call<Response> result = retrofit.create(Controller.class).updateStudentProfile(name, phone, email, password, address);

        Log.e("Profile update URL:", result.request().url().toString());

        result.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                String result = response.body().getResponse();
                if (result.equalsIgnoreCase("success")) {
                    new FragmentUtils(getActivity()).navigateToFragment(R.id.content_main, new StudentProfileFragment(), StudentProfileFragment.TAG);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable throwable) {
                Toast.makeText(getContext(), getString(R.string.error), Toast.LENGTH_LONG).show();
            }
        });
    }


}
