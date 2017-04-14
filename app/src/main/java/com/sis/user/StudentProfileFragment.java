package com.sis.user;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.sis.MainActivity;
import com.sis.R;
import com.sis.login.LoginActivity;
import com.sis.network.App;
import com.sis.network.Controller;
import com.sis.pojo.Profile;
import com.sis.util.Constants;
import com.sis.util.fragment.FragmentUtils;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentProfileFragment extends Fragment {
    public static final String TAG = StudentProfileFragment.class.getName();
    @Inject
    Retrofit retrofit;

    @BindView(R.id.tvEmail)
    TextView tvEmail;
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvPhone)
    TextView tvPhone;
    @BindView(R.id.tvAddress)
    TextView tvAddress;
    @BindView(R.id.bUpdate)
    Button bUpdate;
    View view;

    Profile profilePojo;
    MainActivity activity;

    public StudentProfileFragment() {
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
        view = inflater.inflate(R.layout.fragment_student_profile, container, false);
        ButterKnife.bind(this, view);
        ((App) activity.getApplication()).getNetComponent().inject(this);
        profilePojo = new Profile();
        activity.toolbar.setTitle(getString(R.string.my_profile));
        getProfileDetails();
        bUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StudentProfileUpdateFragment fragment = new StudentProfileUpdateFragment();
                Bundle args = new Bundle();
                args.putSerializable(Constants.PROFILE, profilePojo);
                fragment.setArguments(args);
                new FragmentUtils(getActivity()).navigateToFragment(R.id.content_main, fragment, StudentProfileUpdateFragment.TAG);
            }
        });
        return view;
    }

    public void getProfileDetails() {
        final Call<ArrayList<Profile>> profile = retrofit.create(Controller.class).getStudentProfile(LoginActivity.username);

        Log.e("Profile details URL:", profile.request().url().toString());
        profile.enqueue(new Callback<ArrayList<Profile>>() {
            @Override
            public void onResponse(Call<ArrayList<Profile>> call, Response<ArrayList<Profile>> response) {
                profilePojo.setName(response.body().get(0).getName());
                profilePojo.setUser_email(response.body().get(0).getUser_email());
                profilePojo.setPhone(response.body().get(0).getPhone());
                profilePojo.setAddress(response.body().get(0).getAddress());
                //---------------
                tvName.setText(response.body().get(0).getName());
                tvEmail.setText(response.body().get(0).getUser_email());
                tvPhone.setText(response.body().get(0).getPhone());
                tvAddress.setText(response.body().get(0).getAddress());
            }

            @Override
            public void onFailure(Call<ArrayList<Profile>> call, Throwable throwable) {
                Log.e("PROFILE DETAILS ERROR", throwable.getStackTrace().toString());
            }
        });
    }
}
