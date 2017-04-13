package com.sis.user;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.sis.MainActivity;
import com.sis.R;
import com.sis.network.App;
import com.sis.pojo.Profile;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentProfileUpdateFragment extends Fragment {

    public static final String TAG = StudentProfileUpdateFragment.class.getName();
    @Inject
    Retrofit retrofit;

    @BindView(R.id.etEmail)
    TextView etEmail;
    @BindView(R.id.etName)
    TextView etName;
    @BindView(R.id.etPhone)
    TextView etPhone;
    @BindView(R.id.etAddress)
    TextView etAddress;
    @BindView(R.id.bUpdate)
    Button bUpdate;
    View view;

    Profile profilePojo;
    MainActivity activity;

    public StudentProfileUpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_student_profile_update, container, false);
        ButterKnife.bind(this, view);
        ((App) activity.getApplication()).getNetComponent().inject(this);

        return view;
    }

}
