package com.sis.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mohamed S. El-Shall on 4/7/2017.
 */

public class Notification implements Serializable{


    /**
     * response : success
     * data : [{"notification":{"ID":"4","StudentID":"16","Description":"123456 assigned to you "},"user":{"name":"student1"}},{"notification":{"ID":"3","StudentID":"16","Description":"asasas assigned to you "},"user":{"name":"student1"}},{"notification":{"ID":"1","StudentID":"16","Description":"dssd assigned to you "},"user":{"name":"student1"}}]
     */

    private String response;
    private List<DataBean> data;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * notification : {"ID":"4","StudentID":"16","Description":"123456 assigned to you "}
         * user : {"name":"student1"}
         */

        private NotificationBean notification;
        private UserBean user;

        public NotificationBean getNotification() {
            return notification;
        }

        public void setNotification(NotificationBean notification) {
            this.notification = notification;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class NotificationBean {
            /**
             * ID : 4
             * StudentID : 16
             * Description : 123456 assigned to you
             */

            private String ID;
            private String StudentID;
            private String Description;

            public String getID() {
                return ID;
            }

            public void setID(String ID) {
                this.ID = ID;
            }

            public String getStudentID() {
                return StudentID;
            }

            public void setStudentID(String StudentID) {
                this.StudentID = StudentID;
            }

            public String getDescription() {
                return Description;
            }

            public void setDescription(String Description) {
                this.Description = Description;
            }
        }

        public static class UserBean {
            /**
             * name : student1
             */

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
