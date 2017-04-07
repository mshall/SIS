package com.sis.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mohamed S. El-Shall on 4/7/2017.
 */

public class OpenedCourses implements Serializable {


    /**
     * response : success
     * data : [{"users":["16","student1","student","student@yahoo.com","male","kkkkk","makas","677676767","av1.png","3","2"],"course":{"id":"2","name":"course2","description":"for test","course_number":"12345","dept_id":"2","type":"temp","hours":"3","points":"4","years":"2015/2016","semester":"second","level":"1","status":"open","first_exam":"25","second_exam":"25","final_exam":"50"},"course_time_place":{"id":"2","course_id":"2","day":"sunday","time":" 12pm","building":"2","hole":"1"},"tutor_name":"tutor1"}]
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
         * users : ["16","student1","student","student@yahoo.com","male","kkkkk","makas","677676767","av1.png","3","2"]
         * course : {"id":"2","name":"course2","description":"for test","course_number":"12345","dept_id":"2","type":"temp","hours":"3","points":"4","years":"2015/2016","semester":"second","level":"1","status":"open","first_exam":"25","second_exam":"25","final_exam":"50"}
         * course_time_place : {"id":"2","course_id":"2","day":"sunday","time":" 12pm","building":"2","hole":"1"}
         * tutor_name : tutor1
         */

        private CourseBean course;
        private CourseTimePlaceBean course_time_place;
        private String tutor_name;
        private List<String> users;

        public CourseBean getCourse() {
            return course;
        }

        public void setCourse(CourseBean course) {
            this.course = course;
        }

        public CourseTimePlaceBean getCourse_time_place() {
            return course_time_place;
        }

        public void setCourse_time_place(CourseTimePlaceBean course_time_place) {
            this.course_time_place = course_time_place;
        }

        public String getTutor_name() {
            return tutor_name;
        }

        public void setTutor_name(String tutor_name) {
            this.tutor_name = tutor_name;
        }

        public List<String> getUsers() {
            return users;
        }

        public void setUsers(List<String> users) {
            this.users = users;
        }

        public static class CourseBean {
            /**
             * id : 2
             * name : course2
             * description : for test
             * course_number : 12345
             * dept_id : 2
             * type : temp
             * hours : 3
             * points : 4
             * years : 2015/2016
             * semester : second
             * level : 1
             * status : open
             * first_exam : 25
             * second_exam : 25
             * final_exam : 50
             */

            private String id;
            private String name;
            private String description;
            private String course_number;
            private String dept_id;
            private String type;
            private String hours;
            private String points;
            private String years;
            private String semester;
            private String level;
            private String status;
            private String first_exam;
            private String second_exam;
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

        public static class CourseTimePlaceBean {
            /**
             * id : 2
             * course_id : 2
             * day : sunday
             * time :  12pm
             * building : 2
             * hole : 1
             */

            private String id;
            private String course_id;
            private String day;
            private String time;
            private String building;
            private String hole;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCourse_id() {
                return course_id;
            }

            public void setCourse_id(String course_id) {
                this.course_id = course_id;
            }

            public String getDay() {
                return day;
            }

            public void setDay(String day) {
                this.day = day;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getBuilding() {
                return building;
            }

            public void setBuilding(String building) {
                this.building = building;
            }

            public String getHole() {
                return hole;
            }

            public void setHole(String hole) {
                this.hole = hole;
            }
        }
    }
}
