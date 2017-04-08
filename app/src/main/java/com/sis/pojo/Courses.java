package com.sis.pojo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mohamed S. El-Shall on 4/7/2017.
 */

public class Courses implements Serializable {


    /**
     * response : success
     * data : [{"dept_id":"2","course":{"id":"3","name":"course3","description":"for test","course_number":"15345","dept_id":"2","type":"required","hours":"2","points":"4","years":"2015/2016","semester":"first","level":"1","status":"closed","first_exam":"25","second_exam":"25","final_exam":"50"}}]
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
         * dept_id : 2
         * course : {"id":"3","name":"course3","description":"for test","course_number":"15345","dept_id":"2","type":"required","hours":"2","points":"4","years":"2015/2016","semester":"first","level":"1","status":"closed","first_exam":"25","second_exam":"25","final_exam":"50"}
         */
        @SerializedName("dept_id")
        private String dept_id;
        @SerializedName("course")
        private CourseBean course;

        public String getDept_id() {
            return dept_id;
        }

        public void setDept_id(String dept_id) {
            this.dept_id = dept_id;
        }

        public CourseBean getCourse() {
            return course;
        }

        public void setCourse(CourseBean course) {
            this.course = course;
        }

        public static class CourseBean {
            /**
             * id : 3
             * name : course3
             * description : for test
             * course_number : 15345
             * dept_id : 2
             * type : required
             * hours : 2
             * points : 4
             * years : 2015/2016
             * semester : first
             * level : 1
             * status : closed
             * first_exam : 25
             * second_exam : 25
             * final_exam : 50
             */
            @SerializedName("id")
            private String id;
            @SerializedName("name")
            private String name;
            @SerializedName("description")
            private String description;
            @SerializedName("course_number")
            private String course_number;
            @SerializedName("dept_id")
            private String dept_id;
            @SerializedName("type")
            private String type;
            @SerializedName("hours")
            private String hours;
            @SerializedName("points")
            private String points;
            @SerializedName("years")
            private String years;
            @SerializedName("semester")
            private String semester;
            @SerializedName("level")
            private String level;
            @SerializedName("status")
            private String status;
            @SerializedName("first_exam")
            private String first_exam;
            @SerializedName("second_exam")
            private String second_exam;
            @SerializedName("final_exam")
            private String final_exam;


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

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCourse_number() {
                return course_number;
            }

            public void setCourse_number(String course_number) {
                this.course_number = course_number;
            }

            public String getDept_id() {
                return dept_id;
            }

            public void setDept_id(String dept_id) {
                this.dept_id = dept_id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getHours() {
                return hours;
            }

            public void setHours(String hours) {
                this.hours = hours;
            }

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }

            public String getYears() {
                return years;
            }

            public void setYears(String years) {
                this.years = years;
            }

            public String getSemester() {
                return semester;
            }

            public void setSemester(String semester) {
                this.semester = semester;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getFirst_exam() {
                return first_exam;
            }

            public void setFirst_exam(String first_exam) {
                this.first_exam = first_exam;
            }

            public String getSecond_exam() {
                return second_exam;
            }

            public void setSecond_exam(String second_exam) {
                this.second_exam = second_exam;
            }

            public String getFinal_exam() {
                return final_exam;
            }

            public void setFinal_exam(String final_exam) {
                this.final_exam = final_exam;
            }
        }
    }
}
