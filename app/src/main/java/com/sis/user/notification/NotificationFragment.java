package com.sis.user.notification;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaurav.cdsrecyclerview.CdsRecyclerView;
import com.sis.MainActivity;
import com.sis.R;
import com.sis.adapters.NotificationsAdapter;
import com.sis.login.LoginActivity;
import com.sis.network.App;
import com.sis.network.Controller;
import com.sis.pojo.Datum;
import com.sis.pojo.Notifications;

import java.util.ArrayList;
import java.util.List;

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
public class NotificationFragment extends Fragment {

    public static final String TAG = NotificationFragment.class.getName();
    @BindView(R.id.recyclerView)
    CdsRecyclerView recyclerView;
    View view;
    @Inject
    Retrofit retrofit;
    ArrayList<String> descriptions;
    NotificationsAdapter adapter;
    MainActivity activity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        descriptions = new ArrayList<>();
        activity = (MainActivity) getActivity();

    }

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_notification, container, false);
        ButterKnife.bind(this, view);
        ((App) activity.getApplication()).getNetComponent().inject(this);
        initializeViews();
        getUserNotifications();


        return view;
    }

    private void initializeViews() {
        activity.toolbar.setTitle(getString(R.string.notifications));
        adapter = new NotificationsAdapter(getContext(), descriptions);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public void getUserNotifications() {
        Call<Notifications> notifications = retrofit.create(Controller.class).getUserNotifications(LoginActivity.username);
        Log.e("NOTIFICATION URL:", notifications.request().url().toString());
        notifications.enqueue(new Callback<Notifications>() {
            @Override
            public void onResponse(Call<Notifications> call, Response<Notifications> response) {
                List<Datum> dataBeans = response.body().getData();
                for (Datum datum: dataBeans) {
                    // Adding description to the descriptions arraylist
                    descriptions.add(datum.getNotification().getDescription());
                    //--------------------------------------------------------------------
                    adapter.notifyDataSetChanged();
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Notifications> call, Throwable throwable) {

            }
        });
    }
}
