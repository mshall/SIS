package com.sis.network;

import com.sis.pojo.Courses;
import com.sis.pojo.FullPlan;
import com.sis.pojo.Notifications;
import com.sis.pojo.OpenedCourses;
import com.sis.pojo.Profile;
import com.sis.pojo.Response;
import com.sis.pojo.StudentAssignment;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Mohamed S. El-Shall on 4/8/2017.
 */

public interface Controller {

    //------ login user
    @GET("login.php")
    Call<Response> loginUser(@Query("username") String username, @Query("password") String password);

    //------ get user notifications---------
    @GET("notification.php")
    Call<Notifications> getUserNotifications(@Query("user_id") String userId);

    //------ get student remaining courses
    @GET("remaining_courses.php")
    Call<Courses> getStudentRemainingCourses(@Query("user_id") String userId);

    //------ get student completed courses
    @GET("sucess_courses.php")
    Call<Courses> getStudentCompletedCourses(@Query("user_id") String userId);

    //------ get student assignments
    @GET("student_research.php")
    Call<StudentAssignment> getStudentAssignments(@Query("user_id") String userId);


    //------ get student opened courses
    @GET("opened_courses.php")
    Call<OpenedCourses> getStudentOpenedCourses(@Query("user_id") String userId);

    //------ get student registered courses
    @GET("current_courses.php")
    Call<Courses> getStudentRegisteredCourses(@Query("user_id") String userId);

    //------ register course
    @GET("register_course.php")
    Call<StudentAssignment> registerCourse(@Query("course_id") String courseId, @Query("dept_id") String deptId, @Query("user_id") String userId);

    //------ get student full plan
    @GET("full_plan.php")
    Call<FullPlan> getStudentFullPlan(@Query("user_id") String userId);


    //------ get student profile
    @GET("user_profile.php")
    Call<Profile> getStudentProfile(@Query("user_id") String userId);

    //------ update student profile
    @GET("update_profile.php")
    Call<Response> updateStudentProfile(@Query("name") String name, @Query("phone") String phone, @Query("email") String email, @Query("pass") String password, @Query("address") String address);

}
