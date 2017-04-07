package com.sis.pojo;

import java.io.Serializable;

/**
 * Created by Mohamed S. El-Shall on 4/7/2017.
 */

public class Survey implements Serializable {


    /**
     * id : 54
     * survey_id : 36
     * text : q1
     * question_order : 1
     * optiona : 1
     * optionb : 2
     * optionc : 3
     * optiond : 4
     */

    private String id;
    private String survey_id;
    private String text;
    private String question_order;
    private String optiona;
    private String optionb;
    private String optionc;
    private String optiond;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(String survey_id) {
        this.survey_id = survey_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getQuestion_order() {
        return question_order;
    }

    public void setQuestion_order(String question_order) {
        this.question_order = question_order;
    }

    public String getOptiona() {
        return optiona;
    }

    public void setOptiona(String optiona) {
        this.optiona = optiona;
    }

    public String getOptionb() {
        return optionb;
    }

    public void setOptionb(String optionb) {
        this.optionb = optionb;
    }

    public String getOptionc() {
        return optionc;
    }

    public void setOptionc(String optionc) {
        this.optionc = optionc;
    }

    public String getOptiond() {
        return optiond;
    }

    public void setOptiond(String optiond) {
        this.optiond = optiond;
    }
}
