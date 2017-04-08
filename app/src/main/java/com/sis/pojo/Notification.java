
package com.sis.pojo;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Notification {

    @SerializedName("Description")
    private String mDescription;
    @SerializedName("ID")
    private String mID;
    @SerializedName("StudentID")
    private String mStudentID;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String Description) {
        mDescription = Description;
    }

    public String getID() {
        return mID;
    }

    public void setID(String ID) {
        mID = ID;
    }

    public String getStudentID() {
        return mStudentID;
    }

    public void setStudentID(String StudentID) {
        mStudentID = StudentID;
    }

}
