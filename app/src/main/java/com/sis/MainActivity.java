package com.sis;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.sis.network.App;
import com.sis.user.StudentAssignmentsFragment;
import com.sis.user.StudentProfileFragment;
import com.sis.user.courses.CompletedCoursesFragment;
import com.sis.user.courses.RegisteredCoursesFragment;
import com.sis.user.courses.RemainingCoursesFragment;
import com.sis.user.notification.NotificationFragment;
import com.sis.user.plan.StudentFullPlanFragment;
import com.sis.util.fragment.FragmentUtils;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    FragmentUtils fragmentUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);
        ((App) getApplication()).getNetComponent().inject(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setNavigationItemSelectedListener(this);
        fragmentUtils = new FragmentUtils(this);
        fragmentUtils.navigateToFragment(R.id.content_main, new NotificationFragment(), NotificationFragment.TAG);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_my_profile:
                fragmentUtils.navigateToFragment(R.id.content_main, new StudentProfileFragment(), StudentProfileFragment.TAG);
                break;
            case R.id.nav_full_plan:
                fragmentUtils.navigateToFragment(R.id.content_main, new StudentFullPlanFragment(), StudentFullPlanFragment.TAG);
                break;
            case R.id.nav_my_assignments:
                fragmentUtils.navigateToFragment(R.id.content_main, new StudentAssignmentsFragment(), StudentAssignmentsFragment.TAG);
                break;
            case R.id.nav_registered_courses:
                fragmentUtils.navigateToFragment(R.id.content_main, new RegisteredCoursesFragment(), RegisteredCoursesFragment.TAG);
                break;
            case R.id.nav_completed_courses:
                fragmentUtils.navigateToFragment(R.id.content_main, new CompletedCoursesFragment(), CompletedCoursesFragment.TAG);
                break;
            case R.id.nav_remaining_courses:
                fragmentUtils.navigateToFragment(R.id.content_main, new RemainingCoursesFragment(), RemainingCoursesFragment.TAG);
                break;
            case R.id.nav_notifications:
                fragmentUtils.navigateToFragment(R.id.content_main, new NotificationFragment(), NotificationFragment.TAG);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
