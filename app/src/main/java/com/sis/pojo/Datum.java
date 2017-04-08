
package com.sis.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Datum {

    @SerializedName("notification")
    private Notification mNotification;
    @SerializedName("user")
    private User mUser;

    public Notification getNotification() {
        return mNotification;
    }

    public void setNotification(Notification notification) {
        mNotification = notification;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

}
