package com.sis.network.data.component;

import com.sis.MainActivity;
import com.sis.login.LoginActivity;
import com.sis.network.data.module.AppModule;
import com.sis.network.data.module.NetModule;
import com.sis.user.courses.CompletedCoursesFragment;
import com.sis.user.courses.RemainingCoursesFragment;
import com.sis.user.notification.NotificationFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mohamed S. El-Shall on 4/8/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    //----------- Inject activities -------------------
    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    //----------- Inject Fragments -------------------
    void inject(NotificationFragment notificationFragment);

    void inject(RemainingCoursesFragment remainingCoursesFragment);

    void inject(CompletedCoursesFragment completedCoursesFragment);
}
