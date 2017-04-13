package com.sis.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mohamed S. El-Shall on 4/7/2017.
 */

public class StudentAssignment implements Serializable {


    /**
     * response : success
     * data : [{"assgin_id":"15","id":"15","name":"assign","start_date":"2016-03-01","recive_date":"2016-03-10","notes":"for test","dept_id":"1","course_id":"1","files":"hwamlcom_1290733192_413-1.jpg","direct":"all","tutor_id":"17","course_name":{"name":"course1"},"tutor_name":[{"name":"tutor1"}]},{"assgin_id":"16","id":"16","name":"assign2","start_date":"2016-03-29","recive_date":"2016-03-29","notes":"for test2","dept_id":"1","course_id":"1","files":"gJJTxP12141209.jpg","direct":"all","tutor_id":"17","course_name":{"name":"course1"},"tutor_name":[{"name":"tutor1"}]},{"assgin_id":"17","id":"17","name":"assign3","start_date":"2016-03-16","recive_date":"2016-03-16","notes":"for ","dept_id":"1","course_id":"2","files":"images (3).jpg","direct":"all","tutor_id":"17","course_name":{"name":"course2"},"tutor_name":[{"name":"tutor1"}]},{"assgin_id":"18","id":"18","name":"assign4","start_date":"2016-03-14","recive_date":"2016-03-29","notes":"test","dept_id":"1","course_id":"1","files":"images (5).jpg","direct":"all","tutor_id":"17","course_name":{"name":"course1"},"tutor_name":[{"name":"tutor1"}]}]
     */
    @SerializedName("response")
    private String response;
    @SerializedName("data")
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
         * assgin_id : 15
         * id : 15
         * name : assign
         * start_date : 2016-03-01
         * recive_date : 2016-03-10
         * notes : for test
         * dept_id : 1
         * course_id : 1
         * files : hwamlcom_1290733192_413-1.jpg
         * direct : all
         * tutor_id : 17
         * course_name : {"name":"course1"}
         * tutor_name : [{"name":"tutor1"}]
         */
        @SerializedName("assgin_id")
        private String assgin_id;
        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("start_date")
        private String start_date;
        @SerializedName("recive_date")
        private String recive_date;
        @SerializedName("notes")
        private String notes;
        @SerializedName("dept_id")
        private String dept_id;
        @SerializedName("course_id")
        private String course_id;
        @SerializedName("files")
        private String files;
        @SerializedName("direct")
        private String direct;
        @SerializedName("tutor_id")
        private String tutor_id;
        @SerializedName("course_name")
        private CourseNameBean course_name;
        @SerializedName("tutor_name")
        private List<TutorNameBean> tutor_name;

        public String getAssgin_id() {
            return assgin_id;
        }

        public void setAssgin_id(String assgin_id) {
            this.assgin_id = assgin_id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public String getRecive_date() {
            return recive_date;
        }

        public void setRecive_date(String recive_date) {
            this.recive_date = recive_date;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public String getCourse_id() {
            return course_id;
        }

        public void setCourse_id(String course_id) {
            this.course_id = course_id;
        }

        public String getFiles() {
            return files;
        }

        public void setFiles(String files) {
            this.files = files;
        }

        public String getDirect() {
            return direct;
        }

        public void setDirect(String direct) {
            this.direct = direct;
        }

        public String getTutor_id() {
            return tutor_id;
        }

        public void setTutor_id(String tutor_id) {
            this.tutor_id = tutor_id;
        }

        public CourseNameBean getCourse_name() {
            return course_name;
        }

        public void setCourse_name(CourseNameBean course_name) {
            this.course_name = course_name;
        }

        public List<TutorNameBean> getTutor_name() {
            return tutor_name;
        }

        public void setTutor_name(List<TutorNameBean> tutor_name) {
            this.tutor_name = tutor_name;
        }

        public static class CourseNameBean {
            /**
             * name : course1
             */
            @SerializedName("name")
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class TutorNameBean {
            /**
             * name : tutor1
             */
            @SerializedName("name")
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
