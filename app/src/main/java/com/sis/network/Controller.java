package com.sis.network;

import com.sis.pojo.Courses;
import com.sis.pojo.Notifications;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Mohamed S. El-Shall on 4/8/2017.
 */

public interface Controller {

    //------ get user notifications---------
    @GET("notification.php")
    Call<Notifications> getUserNotifications(@Query("user_id") String userId);

    //------ get student remaining courses
    @GET("remaining_courses.php")
    Call<Courses> getStudentRemainingCourses(@Query("user_id") String userId);

    //------ get student completed courses
    @GET("sucess_courses.php")
    Call<Courses> getStudentCompletedCourses(@Query("user_id") String userId);
}
